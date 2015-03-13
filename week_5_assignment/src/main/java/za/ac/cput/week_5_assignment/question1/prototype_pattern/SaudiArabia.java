package za.ac.cput.week_5_assignment.question1.prototype_pattern;

/**
 * Created by student on 2015/03/09.
 */
public class SaudiArabia extends Government {

    public SaudiArabia()
    {
        type = "";
    }
    
    @Override
    public void getGovernment()
    {
        System.out.println("Saudi Arabia is controlled by an Absolute Monarchy");
    }
}
