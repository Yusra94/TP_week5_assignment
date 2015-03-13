package za.ac.cput.week_5_assignment.question1.abstract_factory;

import za.ac.cput.week_5_assignment.question1.Sport;

/**
 * Created by student on 2015/03/08.
 */
public class Cricket implements Sport{

    public Cricket() {
    }

    @Override
    public String sportPlayed()
    {
        return "Cricket";
    }
}
