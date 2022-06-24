import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int HEIGHT = 750;
    public static final int WIDTH = 950;
    public static final int CIRCLE_DIA = 20;
    public static final float ballAtY1 = HEIGHT * 1 / 5;
    public static final float ballAtY2 = HEIGHT * 2 / 5;
    public static final float ballAtY3 = HEIGHT * 3 / 5;
    public static final float ballAtY4 = HEIGHT * 4 / 5;
    private float ballAtX1 = 0;
    private float ballAtX2 = 0;
    private float ballAtX3 = 0;
    private float ballAtX4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        getCirce(ballAtX1, ballAtY1);
        getCirce(ballAtX2, ballAtY2);
        getCirce(ballAtX3, ballAtY3);
        getCirce(ballAtX4, ballAtY4);
        ballAtX1 += 1;
        ballAtX2 += 2;
        ballAtX3 += 3;
        ballAtX4 += 4;
    }

    private void getCirce(float ballAtX, float ballAtY) {
        ellipse(ballAtX, ballAtY, CIRCLE_DIA, CIRCLE_DIA);
    }
}
