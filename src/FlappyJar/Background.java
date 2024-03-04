package FlappyJar;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background implements KeyboardHandler {

    private boolean spacePressed;
    Picture background;
    public Background() throws InterruptedException {
        while (!spacePressed) {
            background = new Picture(10, 10, "resources/menufinal.jpg");
            background.draw();

            Keyboard kb = new Keyboard(this);

            KeyboardEvent start = new KeyboardEvent();
            start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            start.setKey(KeyboardEvent.KEY_SPACE);
            kb.addEventListener(start);
            removeMenu();
        }
    }

    public void removeMenu(){
        if (spacePressed) {
            background.delete();
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        keyboardEvent.getKey();
        spacePressed=true;


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
