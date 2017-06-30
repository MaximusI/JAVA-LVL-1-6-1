package Main;

/**
 * Created by Maxim on 28.06.2017.
 */
public abstract class Animal {
    protected int maxRunLenght;
    protected double maxJumpHeight;
    protected int maxSwimDistance;

    abstract boolean run(int runDistance);
    abstract boolean jump(double jumpHeight);
    abstract boolean canSwim(int swimDistance);
    Animal(int maxRun, double maxJump, int canSwimDistance) {
        this.maxRunLenght = maxRun;
        this.maxJumpHeight = maxJump;
        this.maxSwimDistance = canSwimDistance;

    }
}
