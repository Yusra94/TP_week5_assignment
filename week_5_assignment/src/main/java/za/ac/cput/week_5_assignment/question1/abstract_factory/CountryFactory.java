package za.ac.cput.week_5_assignment.question1.abstract_factory;

import za.ac.cput.week_5_assignment.question1.Country;
import za.ac.cput.week_5_assignment.question1.Sport;
import za.ac.cput.week_5_assignment.question1.factory_pattern.France;
import za.ac.cput.week_5_assignment.question1.factory_pattern.Germany;
import za.ac.cput.week_5_assignment.question1.factory_pattern.Italy;

/**
 * Created by student on 2015/03/12.
 */
public class CountryFactory extends AbstractFactory {

    @Override
    public Country getCountry(String country)
    {
        if(country == null)
        {
            return null;
        }
        else if(country.equalsIgnoreCase("France"))
        {
            return new France();
        }

        else if(country.equalsIgnoreCase("Italy"))
        {
            return new Italy();
        }

        else if(country.equalsIgnoreCase("Germany"))
        {
            return new Germany();
        }

        return null;
    }

    @Override
    public Sport getSport(String sport) {
        return null;
    }
}
