package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String compliment=null;
        VBox vBox=new VBox(5);
        vBox.setPadding(new Insets(5, 5, 5, 5));

        HBox nameBox=new HBox(5);
        Label nameLabel=new Label("Wpisz swoje imię jubilacie:");
        TextField nameTextField=new TextField();
        nameBox.getChildren().addAll(nameLabel,nameTextField);
        vBox.getChildren().addAll(nameBox);

        TextField complimentTextField=new TextField();
        complimentTextField.setEditable(false);

        HBox btnsArea=new HBox(5);
        Button complimentBtn=new Button("Życz mi!");
        complimentBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Wish w=new Wish();
                complimentTextField.setText(w.toWish(nameTextField.getText())+" "+ nameTextField.getText()+"!");
            }
        });
        Button endBtn=new Button("Zakończ");
        endBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        btnsArea.getChildren().addAll(complimentBtn,endBtn);
        vBox.getChildren().addAll(btnsArea);


        vBox.getChildren().addAll(complimentTextField);

        Scene scene=new Scene(vBox,350,110);

        primaryStage.setTitle("ŻYCZNIK v1.0");
        primaryStage.setScene(scene);
        scene.getStylesheets().add("Viper.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
