package za.ac.cput.week_5_assignment.question1.chain_of_responsibility;

/**
 * Created by student on 2015/03/11.
 */
public class PizzaHandler extends  FoodHandler{

    public void handleRequest(FoodEnum request) {
        if (request == FoodEnum.Burger) {
        } else {
            if (request != null) {
                successor.handleRequest(request);
            }
        }
    }
}
