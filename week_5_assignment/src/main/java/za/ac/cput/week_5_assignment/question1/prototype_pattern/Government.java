package za.ac.cput.week_5_assignment.question1.prototype_pattern;

/**
 * Created by student on 2015/03/09.
 */
public abstract class Government implements Cloneable{

    protected String type;

    public abstract void getGovernment();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
