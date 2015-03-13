package za.ac.cput.week_5_assignment.question1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.week_5_assignment.question1.Country;
import za.ac.cput.week_5_assignment.question1.abstract_factory.AbstractFactory;
import za.ac.cput.week_5_assignment.question1.adapter_pattern.Converter;
import za.ac.cput.week_5_assignment.question1.adapter_pattern.Measure;
import za.ac.cput.week_5_assignment.question1.adapter_pattern.MeasureCentimeters;
import za.ac.cput.week_5_assignment.question1.factory_pattern.CountryFactory;
import za.ac.cput.week_5_assignment.question1.factory_pattern.France;
import za.ac.cput.week_5_assignment.question1.factory_pattern.Germany;
import za.ac.cput.week_5_assignment.question1.factory_pattern.Italy;
import za.ac.cput.week_5_assignment.question1.singleton_pattern.SouthAfrica;

/**
 * Created by student on 2015/03/12.
 */
@Configuration
public class AppConfig {

    CountryFactory cf;
    Measure m;
    Converter c;

    @Bean(name = "country")
    public Country determineCountry()
    {
        cf = new CountryFactory("France");

        if(cf.getCountry().equals(new France()))
        {

            return new France();
        }

        else if(cf.getCountry().equals(new Germany()))
        {

            return new Germany();
        }

        if(cf.getCountry().equals(new Italy()))
        {

            return new Italy();
        }

        return  null;
    }

    /*@Bean(name = "Conversion")
    public Converter determineConversion()
    {
        return new MeasureCentimeters();
    }

    @Bean(name = "conversionMill")
    public Converter converMill()
    {
        return new MeasureCentimeters();
    }*/


}
