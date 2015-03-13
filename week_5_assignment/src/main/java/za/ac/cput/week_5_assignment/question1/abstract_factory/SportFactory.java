package za.ac.cput.week_5_assignment.question1.abstract_factory;

import za.ac.cput.week_5_assignment.question1.Country;
import za.ac.cput.week_5_assignment.question1.Sport;

/**
 * Created by student on 2015/03/08.
 */
public class SportFactory extends AbstractFactory{

    String sport;

    @Override
    public Country getCountry(String country) {
        return null;
    }

    @Override
    public Sport getSport(String sport)
    {
        if(sport == null)
            return null;

        else if(sport.equalsIgnoreCase("cricket"))
            return new Cricket();

        else if(sport.equalsIgnoreCase("Soccer"))
            return new Soccer();

        else if (sport.equalsIgnoreCase("Rugby"))
            return new Rugby();

        return null;
    }


}
