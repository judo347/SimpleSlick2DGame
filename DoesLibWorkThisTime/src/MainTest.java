import org.newdawn.slick.*;

public class MainTest extends BasicGame{
    public MainTest(String gamename) {
        super(gamename);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Hey!", 100,100);
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try {
            appgc = new AppGameContainer(new MainTest("Basic Game!"));
            appgc.setDisplayMode(640,480,false);
            appgc.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }
}
