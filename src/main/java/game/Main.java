package game;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception {
        GameLogic game = new GameLogic(window);
    }


    public static void main(String[] args) {
        launch(Main.class);
    }

}
