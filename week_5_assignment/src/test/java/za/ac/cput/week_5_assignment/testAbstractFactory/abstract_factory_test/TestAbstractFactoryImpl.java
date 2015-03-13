package za.ac.cput.week_5_assignment.testAbstractFactory.abstract_factory_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.week_5_assignment.question1.Config.AppConfig;
import za.ac.cput.week_5_assignment.question1.Country;
import za.ac.cput.week_5_assignment.question1.abstract_factory.AbstractFactory;
import za.ac.cput.week_5_assignment.question1.factory_pattern.CountryFactory;
import za.ac.cput.week_5_assignment.question1.factory_pattern.France;

/**
 * Created by student on 2015/03/12.
 */
public class TestAbstractFactoryImpl {

    CountryFactory c;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        c = (CountryFactory) ctx.getBean("country");



    }

    @Test
    public void testCountryName() throws Exception {

        c = new CountryFactory("France");
        Assert.assertEquals("France", c.getCountry().getCountryName());

    }

    @Test
    public void testCountryPopulation() throws Exception {

        c = new CountryFactory("Italy");
        Assert.assertEquals(28000, c.getCountry().getPopulation());

    }

    @Test
    public void testCountryLanguage() throws Exception {

        c = new CountryFactory("Germany");
        Assert.assertEquals("German", c.getCountry().getMainLanguage());

    }
}
