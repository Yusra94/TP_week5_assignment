package za.ac.cput.week_5_assignment.question1.adapter_pattern;

/**
 * Created by student on 2015/03/10.
 */
public class MeasurementAdapter implements Measure{

    Converter c;

    public MeasurementAdapter(String conversionType)
    {
        if(conversionType.equalsIgnoreCase("millimeters"))
            c = new MeasureMillimeters();

        else if(conversionType.equalsIgnoreCase("centimeters"))
            c = new MeasureCentimeters();


    }

    @Override
    public void measurement(float m, String type)
    {
        if(type.equalsIgnoreCase("millimeters"))
            c.getMillimeters(m);

        else if(type.equalsIgnoreCase("centimeters"))
            c.getCentimeters(m);


    }



}
