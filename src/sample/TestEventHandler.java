package sample;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/** From 'Functional Interfaces in Java' (Ralph Lecessi), 2019 p. 348
 *
 */
public class TestEventHandler extends Application {
    int count =0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button click = new Button("Click Me");
        EventHandler<ActionEvent> handler = x -> {
            count++;
            System.out.println("The button has been clicked "
                + count + " times");
        };
        click.setOnAction(handler);

        StackPane root = new StackPane();
        root.getChildren().add(click);

        Scene scene = new Scene(root, 300,100);

        primaryStage.setTitle("Test Event Handler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
