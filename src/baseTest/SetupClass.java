package baseTest;

import org.newdawn.slick.*;

public class mainTryOut extends BasicGame{

    public mainTryOut(String title) {
        super(title);
    }

    /** Only called once, when game is created.
     *  Load resources for the game, create stuff needed to run game.
     *  Loading screen resources */
    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    /** Getting called every cycle of the game.
     *  if 60FPS =< times called per sec.
     *  Update game logic (move character and such)
     *  @param gameContainer The window, res, mouse pos and so on..
     *  @param delta is the amount in milliseconds that has passed before last call of update. */
    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }

    /** Rendering graphics. (heavy and is running less than update method)
     *  Runs after the update method and gets called from there. */
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    public static void main(String[] args) {
        AppGameContainer app = new AppGameContainer(new SetupClass("Setup Test"));

    }


}
