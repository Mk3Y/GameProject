package game;

import java.util.ArrayList;

/**
 * @author Mirko Nava
 * @version 0.1
 * Created by Mirko Nava - mirkna@gmail.com
 */
public class GameObject implements GameFunctions {

    private ArrayList<GameComponent> Components;

    public GameObject() {
        Components = new ArrayList<GameComponent>();
    }

    public void attach(GameComponent component) {

        component.attach(this);
        Components.add(component);

    }

    public void detach(GameComponent component) {

        component.attach(null);
        Components.remove(component);

    }

    @Override
    public void input() {

        for(GameComponent component: Components) {
            component.input();
        }

    }

    @Override
    public void update() {

        for(GameComponent component: Components) {
            component.update();
        }

    }

    @Override
    public void output() {

        for(GameComponent component: Components) {
            component.output();
        }

    }

}
