package charactercreator;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Krzysztof Gwiżdż
 */
public class CharacterCreator extends Application{

    public static void main(String[] args) {
        Player player;
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("CCCreator v0.1");
    }
}
