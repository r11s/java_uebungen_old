package wuerfel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        Scene scene = new Scene(root);

        stage.setMinWidth(380);
        stage.setMinHeight(380);

        stage.setTitle("Zwei Würfel");
        stage.setScene(scene);
        stage.show();

    }

}
