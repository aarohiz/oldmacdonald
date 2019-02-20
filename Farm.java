/**
 * Tests all of the Animals.
 *
 * @author (Aarohi ZAde)
 * @version (a version number or a date)
 */
public class Farm
{
  private Animal[] a = new Animal[3];
  Farm()
  {
    a[0] = new NamedCow("cow","moo","Elsie");
    a[1] = new Chick("chick","cluck","chirp");
    a[2] = new Pig("pig","oink");
  }

  public void animalSounds()
  {
    for (int i = 0; i < a.length; i++)
    {
      System.out.println(a[i].getType() + " goes " + a[i].getSound());
    }
     System.out.println("The cow is known as " + ((NamedCow)a[0]).getName());
  }
}