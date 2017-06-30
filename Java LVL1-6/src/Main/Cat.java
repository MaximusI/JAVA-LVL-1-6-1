package Main;

/**
 * Created by Maxim on 28.06.2017.
 */
public class Cat extends Animal{


    public Cat(int maxRun, double maxJump, int canSwim) {
        super(maxRun, maxJump, canSwim);
    }

    @Override
    boolean run(int runLenght) {
        if (runLenght > 0 && runLenght <= maxRunLenght)
            return true;
        System.out.println("Incorrect run lenght of your cat - " + runLenght);
        return false;
    }

    @Override
    boolean jump(double jumpHeight) {
        if (jumpHeight > 0 && jumpHeight <= maxJumpHeight)
            return true;
        System.out.println("Incorrect jump height of your cat - " + jumpHeight);
        return false;
    }

    @Override
    boolean canSwim(int swimDistance) {
        System.out.println("Cat is can't swim!");
        return false;
    }
}
