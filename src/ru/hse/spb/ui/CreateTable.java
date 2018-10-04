package ru.hse.spb.ui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ru.hse.spb.Card;
import ru.hse.spb.CardSuit;
import ru.hse.spb.CardValue;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;


public class CreateTable {
    private static Map<Card, String> cardToFilePath = new HashMap();

    static {
        cardToFilePath.put(new Card(CardValue.TWO, CardSuit.DIAMONDS), "src/resources/2b.png");
        cardToFilePath.put(new Card(CardValue.TWO, CardSuit.HEARTS), "src/resources/2ch.png");
        cardToFilePath.put(new Card(CardValue.TWO, CardSuit.CLUBS), "src/resources/2k.png");
        cardToFilePath.put(new Card(CardValue.TWO, CardSuit.SPADES), "src/resources/2v.png");
        cardToFilePath.put(new Card(CardValue.THREE, CardSuit.DIAMONDS), "src/resources/3b.png");
        cardToFilePath.put(new Card(CardValue.THREE, CardSuit.HEARTS), "src/resources/3ch.png");
        cardToFilePath.put(new Card(CardValue.THREE, CardSuit.CLUBS), "src/resources/3k.png");
        cardToFilePath.put(new Card(CardValue.THREE, CardSuit.SPADES), "src/resources/3v.png");
        cardToFilePath.put(new Card(CardValue.FOUR, CardSuit.DIAMONDS), "src/resources/4b.png");
        cardToFilePath.put(new Card(CardValue.FOUR, CardSuit.HEARTS), "src/resources/4ch.png");
        cardToFilePath.put(new Card(CardValue.FOUR, CardSuit.CLUBS), "src/resources/4k.png");
        cardToFilePath.put(new Card(CardValue.FOUR, CardSuit.SPADES), "src/resources/4v.png");
        cardToFilePath.put(new Card(CardValue.FIVE, CardSuit.DIAMONDS), "src/resources/5b.png");
        cardToFilePath.put(new Card(CardValue.FIVE, CardSuit.HEARTS), "src/resources/5ch.png");
        cardToFilePath.put(new Card(CardValue.FIVE, CardSuit.CLUBS), "src/resources/5k.png");
        cardToFilePath.put(new Card(CardValue.FIVE, CardSuit.SPADES), "src/resources/5v.png");
        cardToFilePath.put(new Card(CardValue.SIX, CardSuit.DIAMONDS), "src/resources/6b.png");
        cardToFilePath.put(new Card(CardValue.SIX, CardSuit.HEARTS), "src/resources/6ch.png");
        cardToFilePath.put(new Card(CardValue.SIX, CardSuit.CLUBS), "src/resources/6k.png");
        cardToFilePath.put(new Card(CardValue.SIX, CardSuit.SPADES), "src/resources/6v.png");
        cardToFilePath.put(new Card(CardValue.SEVEN, CardSuit.DIAMONDS), "src/resources/7b.png");
        cardToFilePath.put(new Card(CardValue.SEVEN, CardSuit.HEARTS), "src/resources/7ch.png");
        cardToFilePath.put(new Card(CardValue.SEVEN, CardSuit.CLUBS), "src/resources/7k.png");
        cardToFilePath.put(new Card(CardValue.SEVEN, CardSuit.SPADES), "src/resources/7v.png");
        cardToFilePath.put(new Card(CardValue.EIGHT, CardSuit.DIAMONDS), "src/resources/8b.png");
        cardToFilePath.put(new Card(CardValue.EIGHT, CardSuit.HEARTS), "src/resources/8ch.png");
        cardToFilePath.put(new Card(CardValue.EIGHT, CardSuit.CLUBS), "src/resources/8k.png");
        cardToFilePath.put(new Card(CardValue.EIGHT, CardSuit.SPADES), "src/resources/8v.png");
        cardToFilePath.put(new Card(CardValue.NINE, CardSuit.DIAMONDS), "src/resources/9b.png");
        cardToFilePath.put(new Card(CardValue.NINE, CardSuit.HEARTS), "src/resources/9ch.png");
        cardToFilePath.put(new Card(CardValue.NINE, CardSuit.CLUBS), "src/resources/9k.png");
        cardToFilePath.put(new Card(CardValue.NINE, CardSuit.SPADES), "src/resources/9v.png");
        cardToFilePath.put(new Card(CardValue.TEN, CardSuit.DIAMONDS), "src/resources/10b.png");
        cardToFilePath.put(new Card(CardValue.TEN, CardSuit.HEARTS), "src/resources/10ch.png");
        cardToFilePath.put(new Card(CardValue.TEN, CardSuit.CLUBS), "src/resources/10k.png");
        cardToFilePath.put(new Card(CardValue.TEN, CardSuit.SPADES), "src/resources/10v.png");
        cardToFilePath.put(new Card(CardValue.J, CardSuit.DIAMONDS), "src/resources/jb.png");
        cardToFilePath.put(new Card(CardValue.J, CardSuit.HEARTS), "src/resources/jch.png");
        cardToFilePath.put(new Card(CardValue.J, CardSuit.CLUBS), "src/resources/jk.png");
        cardToFilePath.put(new Card(CardValue.J, CardSuit.SPADES), "src/resources/jv.png");
        cardToFilePath.put(new Card(CardValue.Q, CardSuit.DIAMONDS), "src/resources/qb.png");
        cardToFilePath.put(new Card(CardValue.Q, CardSuit.HEARTS), "src/resources/qch.png");
        cardToFilePath.put(new Card(CardValue.Q, CardSuit.CLUBS), "src/resources/qk.png");
        cardToFilePath.put(new Card(CardValue.Q, CardSuit.SPADES), "src/resources/qv.png");
        cardToFilePath.put(new Card(CardValue.K, CardSuit.DIAMONDS), "src/resources/kb.png");
        cardToFilePath.put(new Card(CardValue.K, CardSuit.HEARTS), "src/resources/kch.png");
        cardToFilePath.put(new Card(CardValue.K, CardSuit.CLUBS), "src/resources/kk.png");
        cardToFilePath.put(new Card(CardValue.K, CardSuit.SPADES), "src/resources/kv.png");
        cardToFilePath.put(new Card(CardValue.ACE, CardSuit.DIAMONDS), "src/resources/ab.png");
        cardToFilePath.put(new Card(CardValue.ACE, CardSuit.HEARTS), "src/resources/ach.png");
        cardToFilePath.put(new Card(CardValue.ACE, CardSuit.CLUBS), "src/resources/ak.png");
        cardToFilePath.put(new Card(CardValue.ACE, CardSuit.SPADES), "src/resources/av.png");

    }

    public static String convert() {
        return cardToFilePath.get(new Card(CardValue.ACE, CardSuit.SPADES));
    }

    public static void createMainActivity(GridPane gridPane, Stage stage) throws MalformedURLException {
        //спросить у контроллера закончилась ли игра

        gridPane.getChildren().clear();
        addActionToButton(
                createButton(gridPane, 50, 200, 0, 1, "", "src/resources/deck.jpeg"),
                actionEvent -> {
                    try {
                        createShowCard(gridPane, stage, convert());
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
        );
        addActionToButton(
                createButton(gridPane, 50, 220, 0, 2, "Выход", null),
                actionEvent -> Platform.exit()
        );
    }

    public static void createShowCard(GridPane gridPane, Stage stage, String imageFile) throws MalformedURLException {
        gridPane.getChildren().clear();
        addActionToButton(
                createButton(gridPane, 50, 200, 0, 0, "", imageFile),
                actionEvent -> {
                }
        );
        addActionToButton(
                createButton(gridPane, 50, 220, 0, 1, "Получить карту", null),
                actionEvent -> {
                    try {
                        createMainActivity(gridPane, stage);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
        );
        addActionToButton(
                createButton(gridPane, 50, 220, 0, 2, "Выход", null),
                actionEvent -> Platform.exit()
        );
    }

    public static void addActionToButton(Button button, EventHandler<ActionEvent> actionEvent) {
        button.setOnAction(actionEvent);
    }

    public static Button createButton(GridPane gridPane, double height, double width, int x, int y, String text, String imageFile) throws MalformedURLException {
        Button button;
        if (imageFile != null) {
            final ImageView imageView = new ImageView();
            imageView.setImage(new Image(new File(imageFile).toURI().toURL().toExternalForm()));
            imageView.setFitHeight(4 * height);
            imageView.setFitWidth(width);
            button = new Button(text, imageView);
        } else {
            button = new Button();
        }
        gridPane.add(button, x, y);
        button.setText(text);
        button.setPrefHeight(height);
        button.setPrefWidth(width);
        button.setLayoutX(x);
        button.setLayoutY(y);
        return button;
    }


    public static void createResult(GridPane gridPane, Stage stage, boolean result) throws MalformedURLException {
        gridPane.getChildren().clear();
        String resultFileName = "lose.jpg";
        if (result) {
            resultFileName = "win.jpg";
        }
        addActionToButton(
                createButton(gridPane, 50, 200, 0, 1, "", "src/resources/" + resultFileName),
                actionEvent -> {
                    try {
                        createShowCard(gridPane, stage, convert());
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
        );
        addActionToButton(
                createButton(gridPane, 50, 220, 0, 2, "Выход", null),
                actionEvent -> Platform.exit()
        );
    }
}
