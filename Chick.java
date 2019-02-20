/**
 * The Chick is unique amongst the animals because it makes 2 sounds randomly.
 * Also has sound and type, as defined by the animal interface
 *
 * @author (Aarohi Zade)
 * @version (2/14/19)
 */
class Chick implements Animal
{
  private String myType;
  private String mySound;
  private String mySound2;

  Chick(String type, String sound, String sound2)
  {
    myType = type;
    mySound = sound;
    mySound2 = sound2;
  }
  public String getSound()
  {
      int random = (int) (Math.random());
      if(random % 2 == 1)
      {
          return mySound2;
      }
      return mySound;
  }
  //public String getSound() { return mySound; }
  public String getType() { return myType; }
}