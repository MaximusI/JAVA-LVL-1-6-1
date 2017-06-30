package Main;

/**
 * Created by Maxim on 28.06.2017.
 */
public class Dog extends Animal {


    public Dog(int maxRun, double maxJump, int canSwim) {
        super(maxRun, maxJump, canSwim);
    }

    @Override
    boolean run(int runLenght) {
        if (runLenght > 0 && runLenght <= maxRunLenght)
            return true;
        System.out.println("Incorrect run lenght of your dog - " + runLenght);
        return false;
    }

    @Override
    boolean jump(double jumpHeight) {
        if (jumpHeight > 0 && jumpHeight <= maxJumpHeight)
            return true;
        System.out.println("Incorrect jump height of your dog - " + jumpHeight);
        return false;
    }

    @Override
    boolean canSwim(int swimDistance) {
        if (swimDistance > 0 && swimDistance <= maxSwimDistance)
            return true;
        System.out.println("Incorrect swim distance of your dog - " + swimDistance);
        return false;
    }
}
