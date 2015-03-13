package za.ac.cput.week_5_assignment.question1.adapter_pattern;

/**
 * Created by student on 2015/03/10.
 */
public class MeasureCentimeters implements Converter{

    @Override
    public float getCentimeters(float x)
    {
        return x/10;
    }

    @Override
    public float getMillimeters(float x)
    {
        return  0;
    }


}
