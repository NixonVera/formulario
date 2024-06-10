package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;



public class Main2 extends Application {

	@Override
    public void start(Stage primaryStage) {
        Button button = new Button("Button");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField("some text...");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        TextArea textArea = new TextArea("Escribir aqui.");
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        ProgressBar progressBar = new ProgressBar(0.49);
        Slider slider = new Slider();

        Label buttonLabel = new Label("Button:");
        Label checkBoxLabel = new Label("CheckBox:");
        Label hyperlinkLabel = new Label("Hyperlink:");
        Label toggleButtonLabel = new Label("ToggleButton:");
        Label radioButtonLabel = new Label("RadioButton:");
        Label labelLabel = new Label("Label:");
        Label textFieldLabel = new Label("TextField:");
        Label passwordFieldLabel = new Label("PasswordField:");
        Label textAreaLabel = new Label("TextArea:");
        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        Label progressBarLabel = new Label("ProgressBar:");
        Label sliderLabel = new Label("Slider:");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10); 
        gridPane.setVgap(10);

        gridPane.add(buttonLabel, 0, 0);
        gridPane.add(button, 1, 0);

        gridPane.add(checkBoxLabel, 0, 1);
        gridPane.add(checkBox, 1, 1);

        gridPane.add(hyperlinkLabel, 0, 2);
        gridPane.add(hyperlink, 1, 2);

        gridPane.add(toggleButtonLabel, 0, 3);
        gridPane.add(toggleButton, 1, 3);

        gridPane.add(radioButtonLabel, 0, 4);
        gridPane.add(radioButton, 1, 4);

        gridPane.add(labelLabel, 0, 5);
        gridPane.add(label, 1, 5);

        gridPane.add(textFieldLabel, 0, 6);
        gridPane.add(textField, 1, 6);

        gridPane.add(passwordFieldLabel, 0, 7);
        gridPane.add(passwordField, 1, 7);

        gridPane.add(textAreaLabel, 0, 8);
        gridPane.add(textArea, 1, 8);

        gridPane.add(progressIndicatorLabel, 0, 9);
        gridPane.add(progressIndicator, 1, 9);

        gridPane.add(progressBarLabel, 0, 10);
        gridPane.add(progressBar, 1, 10);

        gridPane.add(sliderLabel, 0, 11);
        gridPane.add(slider, 1, 11);

        Scene scene = new Scene(gridPane, 400, 600);

        primaryStage.setTitle(" Control App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}