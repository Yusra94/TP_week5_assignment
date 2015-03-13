package za.ac.cput.week_5_assignment.question1.abstract_factory;

//import za.ac.cput.week_5_assignment.question1.factory_pattern.CountryFactory;

/**
 * Created by student on 2015/03/09.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String selection)
    {
        if(selection.equalsIgnoreCase("Sport"))
            return new SportFactory();

        else if(selection.equalsIgnoreCase("Country"))
            return new CountryFactory();

        return null;
    }
}
