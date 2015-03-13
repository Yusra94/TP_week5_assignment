package za.ac.cput.week_5_assignment.question1.singleton_pattern;

/**
 * Created by student on 2015/03/08.
 */
public class SouthAfrica {

    private static SouthAfrica sa = new SouthAfrica();

    private SouthAfrica()
    {}

    public static SouthAfrica getInstance()
    {
        return sa;
    }

    public void message()
    {
        System.out.println("Hello, South Africa!");
    }
}
