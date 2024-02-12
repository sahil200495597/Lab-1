package com.example.personapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PersonApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Person model = new Person(); // create a Person model

        // Create UI components
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age");
        TextField ageField = new TextField();

        Label phoneLabel = new Label("Contact");
        TextField phoneField = new TextField();

        Label addressLabel = new Label("Address");
        TextField addressField = new TextField();

        Button submitButton = new Button("Submit");
        Label resultLabel = new Label();

        PersonController controller = new PersonController(model);

        // Set action for the submit button
        submitButton.setOnAction(e -> {
            // Update the model with the entered data
            model.setName(nameField.getText());
            model.setAge(Integer.parseInt(ageField.getText()));
            model.setPhone(Integer.parseInt(phoneField.getText()));
            model.setAddress(addressField.getText());


            // Call the controller method to handle the button click
            controller.handleSubmitButton();

            resultLabel.setText("Person Information: " + model.toString());
        });

        // Create layout and add components
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        gridPane.add(ageLabel, 0, 1);
        gridPane.add(ageField, 1, 1);

        gridPane.add(phoneLabel, 0, 2);
        gridPane.add(phoneField, 1, 2);

        gridPane.add(addressLabel, 0, 3);
        gridPane.add(addressField, 1, 3);


        gridPane.add(submitButton, 0, 4, 2, 1);
        gridPane.add(resultLabel, 0, 5, 2, 1);


        // Create and set the scene
        Scene scene = new Scene(gridPane, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Person Information Form");
        primaryStage.show();
    }
}
