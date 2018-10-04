package ru.hse.spb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.List;

public class Main extends Application {
    private GameController controller = new GameController();

    private Scene createBoardScene() {
        BorderPane border = new BorderPane();

        Button standButton = new Button();
        Button hitButton = new Button();

        Text dealerScore = new Text();
        Text userScore = new Text();
        Text gameResult = new Text();

        HBox dealerHand = new HBox(10);
        HBox userHand = new HBox(10);

        VBox hands = new VBox(10);
        VBox buttons = new VBox(10);
        VBox Texts = new VBox(10);

        buttons.getChildren().addAll(standButton, hitButton);
        Texts.getChildren().addAll(dealerScore, userScore);

        hands.getChildren().addAll(dealerHand, userHand);

        border.setCenter(hands);
        border.setTop(gameResult);
        border.setLeft(Texts);
        border.setRight(buttons);
        border.setPadding(new Insets(15, 20, 10, 10));


        standButton.setOnAction(e -> {
            standButton.setDisable(true);
            hitButton.setDisable(true);
            controller.stand();
            Hand hand = controller.getDealerHand();
            int score = hand.getSum();
            List<Card> cards = hand.getCards();
            fillHand(dealerHand, cards);
            dealerScore.setText(Integer.toString(score));
            GameResult result = controller.getGameResult();
            gameResult.setText(result);
        });

        hitButton.setOnAction(e -> {
            Card card = controller.hit();
            userHand.getChildren().add(new Text(card.toString()));
            int score = controller.getPlayerScore();
            userScore.setText(Integer.toString(score));
            State state = controller.getPlayerState();
            if (state == State.PLAYING) {
                hitButton.setDisable(true);
            }
        });

        Pair<Hand, Hand> handPair = controller.init();
        fillHand(dealerHand, handPair.getValue().getCards());
        fillHand(userHand, handPair.getKey().getCards());

        userScore.setText(Integer.toString(handPair.getKey().getScore()));
        dealerScore.setText(Integer.toString(handPair.getValue().getScore()));


        return new Scene(border, 400, 275);
    }

    private void fillHand(HBox handHBox, List<Card> cards) {
        for (Card card : cards) {
            handHBox.getChildren().add(new Text(card.toString()));
        }
    }



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainscreen.fxml"));
        primaryStage.setTitle("Blackjack");
        primaryStage.setScene(createBoardScene());
        //primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
