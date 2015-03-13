package za.ac.cput.week_5_assignment.question1.factory_pattern;

import za.ac.cput.week_5_assignment.question1.Country;
import za.ac.cput.week_5_assignment.question1.Sport;
import za.ac.cput.week_5_assignment.question1.abstract_factory.AbstractFactory;

/**
 * Created by student on 2015/03/08.
 */
public class CountryFactory {

    String country;

    public CountryFactory(String country)
    {
        this.country = country;
    }

    public Country getCountry()
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

}
