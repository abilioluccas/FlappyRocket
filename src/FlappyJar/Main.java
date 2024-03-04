package FlappyJar;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Background background = new Background();



        //background


        while (true) {
            EventHandler eventHandler = new EventHandler();


            eventHandler.setScore();
            eventHandler.init();
            eventHandler.moveIcon();
        }
    }
}
