package FlappyJar;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EventHandler implements KeyboardHandler {

    private Picture bird,
            rock1, rock2, rock3, rock4, rock5, rock6, rock7, rock8, rock9,
            rock10, rock11, rock12, rock13, rock14, rock15, rock16, rock17, rock18,
            rock19, rock20, rock21,
            gameOver, cloud1, cloud2, cloud3, cloud4,
            bigMountain, smallMountain, floor,
            tree, pineTree, tree1, pineTree1, tree2, pinetree2, tree3,
            pineTree3, tree4, pineTree4, tree5, pineTree5,
            tree6, pineTree6, pineTree7, tree7, tree8, pineTree8,
            tree9, pineTree9, tree10, pineTree10, tree11, pineTree11,
            pineTree12, tree12, pineTree13, tree13, pineTree14, tree14,
            background;

    private Text setScore;
    private int score = 0;
    private double SPEED_MAC = 5;


    public void setScore() {
        setScore = new Text(100, 60, "Score: " + score);
        setScore.setColor(Color.WHITE);
        setScore.grow(20, 10);
        score += 10;
        setScore.draw();
    }

    public void newScore() {
        setScore.delete();
    }

    public EventHandler() {

        this.background = new Picture(10, 10, "resources/backgroundfinal.jpg");

        this.bird = new Picture(755, 100, "resources/birdresize.png");

        this.rock1 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock2 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock3 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.rock4 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock5 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock6 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.rock7 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock8 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock9 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.rock10 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock11 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock12 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.rock13 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock14 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock15 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.rock16 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock17 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock18 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.rock19 = new Picture(1470, Math.floor(Math.random() * (200 - 50 + 1)) + 30, "resources/rocket35 14.png");
        this.rock20 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
        this.rock21 = new Picture(1470, Math.floor(Math.random() * 203 + 435), "resources/rocket35 14.png");

        this.gameOver = new Picture(520, 20, "resources/gameOver.png");

        //background
        this.cloud1 = new Picture(300, Math.floor(Math.random() * 200), "resources/bigcloud.png");
        this.cloud2 = new Picture(600, Math.floor(Math.random() * 200 + 100), "resources/smallcloud.png");
        this.cloud3 = new Picture(900, Math.floor(Math.random() * 200 + 200), "resources/bigcloud.png");
        this.cloud4 = new Picture(1200, Math.floor(Math.random() * 200 + 200), "resources/smallcloud.png");

        this.bigMountain = new Picture(100, 310, "resources/bigmountain.png");
        this.smallMountain = new Picture(1000, 410, "resources/smallmountain.png");

        this.floor = new Picture(10, 652, "resources/floor.jpg");

        this.tree = new Picture(70, 555, "resources/tree.png");
        this.pineTree = new Picture(100, 575, "resources/pinetree.png");
        this.tree1 = new Picture(150, 555, "resources/tree.png");
        this.pineTree1 = new Picture(200, 575, "resources/pinetree.png");
        this.tree2 = new Picture(250, 555, "resources/tree.png");
        this.pinetree2 = new Picture(300, 575, "resources/pinetree.png");
        this.tree3 = new Picture(350, 555, "resources/tree.png");
        this.pineTree3 = new Picture(400, 575, "resources/pinetree.png");
        this.pineTree4 = new Picture(450, 575, "resources/pinetree.png");
        this.tree4 = new Picture(500, 555, "resources/tree.png");
        this.pineTree5 = new Picture(550, 575, "resources/pinetree.png");
        this.tree5 = new Picture(600, 555, "resources/tree.png");
        this.pineTree6 = new Picture(650, 575, "resources/pinetree.png");
        this.tree6 = new Picture(700, 555, "resources/tree.png");
        this.pineTree7 = new Picture(750, 575, "resources/pinetree.png");
        this.tree7 = new Picture(800, 555, "resources/tree.png");
        this.pineTree8 = new Picture(850, 575, "resources/pinetree.png");
        this.tree8 = new Picture(900, 555, "resources/tree.png");
        this.pineTree9 = new Picture(950, 575, "resources/pinetree.png");
        this.tree9 = new Picture(1000, 555, "resources/tree.png");
        this.pineTree10 = new Picture(1050, 575, "resources/pinetree.png");
        this.tree10 = new Picture(1100, 555, "resources/tree.png");
        this.pineTree11 = new Picture(1150, 575, "resources/pinetree.png");
        this.tree11 = new Picture(1200, 555, "resources/tree.png");
        this.pineTree12 = new Picture(1250, 575, "resources/pinetree.png");
        this.tree12 = new Picture(1300, 555, "resources/tree.png");
        this.pineTree13 = new Picture(1350, 575, "resources/pinetree.png");
        this.tree13 = new Picture(1400, 555, "resources/tree.png");
        this.pineTree14 = new Picture(1450, 575, "resources/pinetree.png");
        this.tree14 = new Picture(1470, 555, "resources/tree.png");

        background.draw();
        bigMountain.draw();
        smallMountain.draw();

        cloud1.draw();
        cloud2.draw();
        cloud3.draw();
        cloud4.draw();

        floor.draw();
        tree.draw();
        pineTree.draw();
        tree1.draw();
        pineTree1.draw();
        tree2.draw();
        pinetree2.draw();
        tree3.draw();
        pineTree3.draw();
        tree4.draw();
        pineTree4.draw();
        tree5.draw();
        pineTree5.draw();
        tree6.draw();
        pineTree6.draw();
        tree7.draw();
        pineTree7.draw();
        tree8.draw();
        pineTree8.draw();
        tree9.draw();
        pineTree9.draw();
        tree10.draw();
        pineTree10.draw();
        tree11.draw();
        pineTree11.draw();
        tree12.draw();
        pineTree12.draw();
        tree13.draw();
        pineTree13.draw();
        tree14.draw();
        pineTree14.draw();

        bird.draw();

    }

    double i = 0;


    public void init() {

        Keyboard kb = new Keyboard(this);

        KeyboardEvent up = new KeyboardEvent();
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        up.setKey(KeyboardEvent.KEY_SPACE);
        kb.addEventListener(up);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        keyboardEvent.getKey();
        bird.translate(0, -45);
        if (crash || bird.getY() <= 0) {
            bird.delete();
            gameOver.draw();


        }
        i = 0;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    final double rockSpeed = 0.0003;//myPC
    final double rockSpeedMac = 5;
    double rock1Dir = rockSpeedMac;
    double rock2Dir = rockSpeedMac;
    double rock3Dir = rockSpeedMac;
    double rock4Dir = rockSpeedMac;
    double rock5Dir = rockSpeedMac;
    double rock6Dir = rockSpeedMac;
    double rock7Dir = rockSpeedMac;
    double rock8Dir = rockSpeedMac;
    double rock9Dir = rockSpeedMac;
    double rock10Dir = rockSpeedMac;
    double rock11Dir = rockSpeedMac;
    double rock12Dir = rockSpeedMac;
    double rock13Dir = rockSpeedMac;
    double rock14Dir = rockSpeedMac;
    double rock15Dir = rockSpeedMac;
    double rock16Dir = rockSpeedMac;
    double rock17Dir = rockSpeedMac;
    double rock18Dir = rockSpeedMac;
    double rock19Dir = rockSpeedMac;
    double rock20Dir = rockSpeedMac;
    double rock21Dir = rockSpeedMac;

    boolean crash;
    boolean move1, move2, move3, move4, move5, move6;

    boolean waitingScore1 = true,
            waitingScore2 = true,
            waitingScore3 = true,
            waitingScore4 = true,
            waitingScore5 = true,
            waitingScore6 = true,
            waitingScore7 = true;

    public void moveIcon() throws InterruptedException {

        while (!crash) {
            Thread.sleep(45);

            i = i + 0.000000000002;

            this.cloud1.translate(-5, 0);
            this.cloud2.translate(-5, 0);
            this.cloud3.translate(-5, 0);
            this.cloud4.translate(-5, 0);

            this.tree.translate(-5, 0);
            this.pineTree.translate(-5, 0);
            this.tree1.translate(-5, 0);
            this.pineTree1.translate(-5, 0);
            this.tree2.translate(-5, 0);
            this.pinetree2.translate(-5, 0);
            this.tree3.translate(-5, 0);
            this.pineTree3.translate(-5, 0);
            this.tree4.translate(-5, 0);
            this.pineTree4.translate(-5, 0);
            this.tree5.translate(-5, 0);
            this.pineTree5.translate(-5, 0);
            this.tree6.translate(-5, 0);
            this.pineTree6.translate(-5, 0);
            this.tree7.translate(-5, 0);
            this.pineTree7.translate(-5, 0);
            this.tree8.translate(-5, 0);
            this.pineTree8.translate(-5, 0);
            this.tree9.translate(-5, 0);
            this.pineTree9.translate(-5, 0);
            this.tree10.translate(-5, 0);
            this.pineTree10.translate(-5, 0);
            this.tree11.translate(-5, 0);
            this.pineTree11.translate(-5, 0);
            this.tree12.translate(-5, 0);
            this.pineTree12.translate(-5, 0);
            this.tree13.translate(-5, 0);
            this.pineTree13.translate(-5, 0);
            this.tree14.translate(-5, 0);
            this.pineTree14.translate(-5, 0);

            if (cloud1.getX() <= 0) {
                cloud1.translate(1370, 0);
            }
            if (cloud2.getX() <= 0) {
                cloud2.translate(1465, 0);
            }
            if (cloud3.getX() <= 0) {
                cloud3.translate(1370, 0);
            }
            if (cloud4.getX() <= 0) {
                cloud4.translate(1465, 0);

            }
            if (bigMountain.getX() < 0) {
                bigMountain.translate(0, 0);
            }
            if (smallMountain.getX() < 0) {
                smallMountain.translate(0, 0);
            }
            if (pineTree.getX() <= 0) {
                pineTree.translate(1450, 0);
            }
            if (tree.getX() <= 0) {
                tree.translate(1450, 0);
            }
            if (pineTree1.getX() <= 0) {
                pineTree1.translate(1450, 0);
            }
            if (tree1.getX() <= 0) {
                tree1.translate(1450, 0);
            }
            if (pinetree2.getX() <= 0) {
                pinetree2.translate(1450, 0);
            }
            if (tree2.getX() <= 0) {
                tree2.translate(1450, 0);
            }
            if (tree3.getX() <= 5) {
                tree3.translate(1460, 0);
            }
            if (pineTree3.getX() <= 5) {
                pineTree3.translate(1460, 0);
            }
            if (pineTree4.getX() <= 5) {
                pineTree4.translate(1460, 0);
            }
            if (tree4.getX() <= 5) {
                tree4.translate(1460, 0);
            }
            if (pineTree5.getX() <= 5) {
                pineTree5.translate(1460, 0);
            }
            if (tree5.getX() <= 5) {
                tree5.translate(1460, 0);
            }
            if (pineTree6.getX() <= 5) {
                pineTree6.translate(1460, 0);
            }
            if (tree6.getX() <= 5) {
                tree6.translate(1460, 0);
            }
            if (tree7.getX() <= 5) {
                tree7.translate(1460, 0);
            }
            if (pineTree7.getX() <= 5) {
                pineTree7.translate(1460, 0);
            }
            if (pineTree8.getX() <= 5) {
                pineTree8.translate(1460, 0);
            }
            if (tree8.getX() <= 5) {
                tree8.translate(1460, 0);
            }
            if (pineTree9.getX() <= 5) {
                pineTree9.translate(1460, 0);
            }
            if (tree9.getX() <= 5) {
                tree9.translate(1460, 0);
            }
            if (pineTree10.getX() <= 5) {
                pineTree10.translate(1460, 0);
            }
            if (tree10.getX() <= 5) {
                tree10.translate(1460, 0);
            }
            if (tree11.getX() <= 5) {
                tree11.translate(1460, 0);
            }
            if (pineTree11.getX() <= 5) {
                pineTree11.translate(1460, 0);
            }
            if (pineTree12.getX() <= 5) {
                pineTree12.translate(1460, 0);
            }
            if (tree12.getX() <= 5) {
                tree12.translate(1460, 0);
            }
            if (pineTree13.getX() <= 5) {
                pineTree13.translate(1460, 0);
            }
            if (tree13.getX() <= 5) {
                tree13.translate(1460, 0);
            }
            if (pineTree14.getX() <= 5) {
                pineTree14.translate(1460, 0);
            }
            if (tree14.getX() <= 5) {
                tree14.translate(1460, 0);
            }


            if (bird.getY() < 600) {
                final double SPEED = 0.0003; //myPC
                SPEED_MAC = SPEED_MAC + 0.02;
                rock1.draw();
                rock2.draw();
                rock3.draw();


                i = i + 0.4;
                this.bird.translate(0, 1.5 + i); //myPC 0.00008


                this.rock1.translate(-SPEED_MAC, rock1Dir);
                if (ifHit(rock1)) {
                    break;
                }
                if (rock1.getY() > 203 || rock1.getY() < 10) {
                    rock1Dir = -rock1Dir;
                }
                this.rock2.translate(-SPEED_MAC, -rock2Dir);
                if (ifHit(rock2)) {
                    break;
                }
                if (rock2.getY() > 417 || rock2.getY() < 217) {
                    rock2Dir = -rock2Dir;
                }
                this.rock3.translate(-SPEED_MAC, rock3Dir);
                if (ifHit(rock3)) {
                    break;
                }
                if (rock3.getY() > 635 || rock3.getY() < 434) {
                    rock3Dir = -rock3Dir;
                }

                if (rock3.getX() < 1250 || move1) {
                    rock4.draw();
                    rock5.draw();
                    rock6.draw();
                    move1 = true;
                    this.rock4.translate(-SPEED_MAC, -rock4Dir);
                    if (ifHit(rock4)) {
                        break;
                    }
                    if (rock4.getY() > 203 || rock4.getY() < 10) {
                        rock4Dir = -rock4Dir;
                    }
                    this.rock5.translate(-SPEED_MAC, rock5Dir);
                    if (ifHit(rock5)) {
                        break;
                    }
                    if (rock5.getY() > 417 || rock5.getY() < 217) {
                        rock5Dir = -rock5Dir;
                    }
                    this.rock6.translate(-SPEED_MAC, -rock6Dir);
                    if (ifHit(rock6)) {
                        break;
                    }
                    if (rock6.getY() > 635 || rock6.getY() < 434) {
                        rock6Dir = -rock6Dir;
                    }
                }
                if (rock6.getX() < 1250 || move2) {
                    rock7.draw();
                    rock8.draw();
                    rock9.draw();
                    move2 = true;
                    this.rock7.translate(-SPEED_MAC, -rock7Dir);
                    if (ifHit(rock7)) {
                        break;
                    }
                    if (rock7.getY() > 203 || rock7.getY() < 10) {
                        rock7Dir = -rock7Dir;
                    }
                    this.rock8.translate(-SPEED_MAC, rock8Dir);
                    if (ifHit(rock8)) {
                        break;
                    }
                    if (rock8.getY() > 417 || rock8.getY() < 217) {
                        rock8Dir = -rock8Dir;
                    }
                    this.rock9.translate(-SPEED_MAC, -rock9Dir);
                    if (ifHit(rock9)) {
                        break;
                    }
                    if (rock9.getY() > 635 || rock9.getY() < 434) {
                        rock9Dir = -rock9Dir;
                    }
                }
                if (rock9.getX() < 1250 || move3) {
                    rock10.draw();
                    rock11.draw();
                    rock12.draw();
                    move3 = true;
                    this.rock10.translate(-SPEED_MAC, -rock10Dir);
                    if (ifHit(rock10)) {
                        break;
                    }
                    if (rock10.getY() > 203 || rock10.getY() < 10) {
                        rock10Dir = -rock10Dir;
                    }
                    this.rock11.translate(-SPEED_MAC, rock11Dir);
                    if (ifHit(rock11)) {
                        break;
                    }
                    if (rock11.getY() > 417 || rock11.getY() < 217) {
                        rock11Dir = -rock11Dir;
                    }
                    this.rock12.translate(-SPEED_MAC, -rock12Dir);
                    if (ifHit(rock12)) {
                        break;
                    }
                    if (rock12.getY() > 635 || rock12.getY() < 434) {
                        rock12Dir = -rock12Dir;
                    }
                }
                if (rock12.getX() < 1250 || move4) {
                    rock13.draw();
                    rock14.draw();
                    rock15.draw();
                    move4 = true;
                    this.rock13.translate(-SPEED_MAC, -rock13Dir);
                    if (ifHit(rock13)) {
                        break;
                    }
                    if (rock13.getY() > 203 || rock13.getY() < 10) {
                        rock13Dir = -rock13Dir;
                    }
                    this.rock14.translate(-SPEED_MAC, rock14Dir);
                    if (ifHit(rock14)) {
                        break;
                    }
                    if (rock14.getY() > 417 || rock14.getY() < 217) {
                        rock14Dir = -rock14Dir;
                    }
                    this.rock15.translate(-SPEED_MAC, -rock15Dir);
                    if (ifHit(rock15)) {
                        break;
                    }
                    if (rock15.getY() > 635 || rock15.getY() < 434) {
                        rock15Dir = -rock15Dir;
                    }
                }
                if (rock15.getX() < 1250 || move5) {
                    rock16.draw();
                    rock17.draw();
                    rock18.draw();
                    move5 = true;
                    this.rock16.translate(-SPEED_MAC, -rock16Dir);
                    if (ifHit(rock16)) {
                        break;
                    }
                    if (rock16.getY() > 203 || rock16.getY() < 10) {
                        rock16Dir = -rock16Dir;
                    }
                    this.rock17.translate(-SPEED_MAC, rock17Dir);
                    if (ifHit(rock17)) {
                        break;
                    }
                    if (rock17.getY() > 421 || rock17.getY() < 217) {
                        rock17Dir = -rock17Dir;
                    }
                    this.rock18.translate(-SPEED_MAC, -rock18Dir);
                    if (ifHit(rock18)) {
                        break;
                    }
                    if (rock18.getY() > 635 || rock18.getY() < 434) {
                        rock18Dir = -rock18Dir;
                    }
                }
                if (rock18.getX() < 1250 || move6) {
                    rock19.draw();
                    rock20.draw();
                    rock21.draw();
                    move6 = true;
                    this.rock19.translate(-SPEED_MAC, -rock19Dir);
                    if (ifHit(rock19)) {
                        break;
                    }
                    if (rock19.getY() > 203 || rock19.getY() < 10) {
                        rock19Dir = -rock19Dir;
                    }
                    this.rock20.translate(-SPEED_MAC, rock20Dir);
                    if (ifHit(rock20)) {
                        break;
                    }
                    if (rock20.getY() > 421 || rock20.getY() < 217) {
                        rock20Dir = -rock20Dir;
                    }
                    this.rock21.translate(-SPEED_MAC, -rock21Dir);
                    if (ifHit(rock21)) {
                        break;
                    }
                    if (rock21.getY() > 635 || rock21.getY() < 434) {
                        rock21Dir = -rock21Dir;
                    }
                }

                if (rock1.getX() <= 750 && waitingScore1 && !crash){
                    newScore();
                    setScore();
                    waitingScore1=false;
                }
                if (rock4.getX() <= 750 && waitingScore2 && !crash){
                    newScore();
                    setScore();
                    waitingScore2=false;
                }
                if (rock7.getX() <= 750 && waitingScore3 && !crash){
                    newScore();
                    setScore();
                    waitingScore3=false;
                }
                if (rock10.getX() <= 750 && waitingScore4 && !crash){
                    newScore();
                    setScore();
                    waitingScore4=false;
                }
                if (rock13.getX() <= 750 && waitingScore5 && !crash){
                    newScore();
                    setScore();
                    waitingScore5=false;
                }
                if (rock16.getX() <= 750 && waitingScore6 && !crash){
                    newScore();
                    setScore();
                    waitingScore6=false;
                }
                if (rock19.getX() <= 750 && waitingScore7 && !crash){
                    newScore();
                    setScore();
                    waitingScore7=false;
                }


                if (rock1.getX() < -100) {
                    rock1.delete();
                    rock1 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock1.draw();
                    rock2.delete();
                    rock2 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock2.draw();
                    rock3.delete();
                    rock3 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock3.draw();
                    waitingScore1=true;

                }

                if (rock4.getX() < -100) {
                    rock4.delete();
                    rock4 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock4.draw();
                    rock5.delete();
                    rock5 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock5.draw();
                    rock6.delete();
                    rock6 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock6.draw();
                    waitingScore2=true;
                }
                if (rock7.getX() < -100) {
                    rock7.delete();
                    rock7 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock7.draw();
                    rock8.delete();
                    rock8 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock8.draw();
                    rock9.delete();
                    rock9 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock9.draw();
                    waitingScore3=true;
                }
                if (rock10.getX() < -100) {
                    rock10.delete();
                    rock10 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock10.draw();
                    rock11.delete();
                    rock11 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock11.draw();
                    rock12.delete();
                    rock12 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock12.draw();
                    waitingScore4=true;
                }
                if (rock13.getX() < -100) {
                    rock13.delete();
                    rock13 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock13.draw();
                    rock14.delete();
                    rock14 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock14.draw();
                    rock15.delete();
                    rock15 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock15.draw();
                    waitingScore5=true;
                }
                if (rock16.getX() < -100) {
                    rock16.delete();
                    rock16 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock16.draw();
                    rock17.delete();
                    rock17 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock17.draw();
                    rock18.delete();
                    rock18 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock18.draw();
                    waitingScore6=true;
                }
                if (rock19.getX() < -100) {
                    rock19.delete();
                    rock19 = new Picture(1470, Math.floor(Math.random() * (200 - 20 + 1)) + 20, "resources/rocket35 14.png");
                    rock19.draw();
                    rock20.delete();
                    rock20 = new Picture(1470, Math.floor(Math.random() * 204 + 217), "resources/rocket35 14.png");
                    rock20.draw();
                    rock21.delete();
                    rock21 = new Picture(1470, Math.floor(Math.random() * 203 + 420), "resources/rocket35 14.png");
                    rock21.draw();
                    waitingScore7=true;
                }



            } else {
                bird.delete();
                crash = true;

            }
        }
        gameOver.draw();
        Thread.sleep(3000);
    }


    public boolean ifHit(Picture rock) {

        boolean overlapX = bird.getX() <= rock.getMaxX() && bird.getMaxX() >= rock.getX();

        boolean overlapY = bird.getY() <= rock.getMaxY() && bird.getMaxY() >= rock.getY();

        boolean passLimits = bird.getY() <= 0 || bird.getMaxY() >= 652;
        //crash = false;
        //return false;
        crash = (overlapX && overlapY ) || passLimits;
        return crash;

    }
}
