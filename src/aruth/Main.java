package aruth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("aruth_interface.fxml"));
        primaryStage.setTitle("Aruth");
        primaryStage.setScene(new Scene(root, 650, 680));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/aruth/aruth-logo.png")));
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
