package za.ac.cput.week_5_assignment.question1.factory_pattern;

import za.ac.cput.week_5_assignment.question1.Country;

/**
 * Created by student on 2015/03/08.
 */
public class Germany implements Country {

    @Override
    public String getCountryName()
    {
        return "Germany";
    }

    @Override
    public long getPopulation()
    {
        return 100000;
    }

    @Override
    public String getMainLanguage()
    {
        return "German";
    }
}
