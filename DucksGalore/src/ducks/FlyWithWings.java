package ducks;

public class FlyWithWings implements FlyBehaviour {

  public FlyWithWings() {
  }

  @Override
  public void fly() {
    System.out.println("I'm flying!");
  }
 

}
