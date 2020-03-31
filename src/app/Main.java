package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("future-value-calculator-app.fxml"));

        Image icon = new Image(Main.class.getResourceAsStream("/img/calculator-img.png"));
        primaryStage.getIcons().add(icon);

        primaryStage.setTitle(" Future Value Calculator");
        primaryStage.setScene(new Scene(root, 550, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}//end of the Main Class
