package za.ac.cput.week_5_assignment.question1.factory_pattern;

import za.ac.cput.week_5_assignment.question1.Country;

/**
 * Created by student on 2015/03/08.
 */
public class Italy implements Country{

    @Override
    public String getCountryName()
    {
        return "Italy";
    }

    @Override
    public long getPopulation()
    {
        return 28000;
    }

    @Override
    public String getMainLanguage()
    {
        return "Italian";
    }
}
