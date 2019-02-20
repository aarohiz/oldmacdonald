
/**
 * A NamedCow inherits sound and type from Cow, but also has a name.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NamedCow extends Cow
{
    private String myName;
    NamedCow(String type, String sound, String name)
    {
        super(type, sound);
        myName = name;
    }
    public String getName()
    {
        return myName;
    }
}
