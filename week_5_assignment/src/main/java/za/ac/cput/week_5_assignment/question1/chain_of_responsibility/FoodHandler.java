package za.ac.cput.week_5_assignment.question1.chain_of_responsibility;

/**
 * Created by student on 2015/03/11.
 */
public abstract class FoodHandler {

    FoodHandler successor;

    public void setSuccessor(FoodHandler successor)
    {
        this.successor = successor;
    }

    public abstract void handleRequest(FoodEnum request);

}
