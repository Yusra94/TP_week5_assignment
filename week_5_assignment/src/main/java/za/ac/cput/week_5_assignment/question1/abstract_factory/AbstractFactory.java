package za.ac.cput.week_5_assignment.question1.abstract_factory;

import za.ac.cput.week_5_assignment.question1.Country;
import za.ac.cput.week_5_assignment.question1.Sport;

/**
 * Created by student on 2015/03/08.
 */
public abstract class AbstractFactory {

    public abstract Country getCountry(String country);
    public abstract Sport getSport(String sport);


}
