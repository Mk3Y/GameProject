package game;

/**
 * @author Mirko Nava
 * @version 0.1
 * Created by Mirko Nava - mirkna@gmail.com
 */
public abstract class GameComponent implements GameFunctions {

    private GameObject Object;

    public GameComponent() {
        Object = null;
    }

    public void attach(GameObject object) {
        this.Object = object;
    }

}
