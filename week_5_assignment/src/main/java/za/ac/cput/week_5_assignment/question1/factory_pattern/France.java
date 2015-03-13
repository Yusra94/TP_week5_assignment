package za.ac.cput.week_5_assignment.question1.factory_pattern;

import za.ac.cput.week_5_assignment.question1.Country;

/**
 * Created by student on 2015/03/08.
 */
public class France implements Country {

    @Override
    public String getCountryName()
    {
        return "France";
    }

    @Override
    public long getPopulation()
    {
        return 800000;
    }

    @Override
    public String getMainLanguage()
    {
        return "French";
    }


}
