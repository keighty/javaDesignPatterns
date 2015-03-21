package ducks;

public class FlyNoWay implements FlyBehaviour {

  public FlyNoWay() {
  }

  @Override
  public void fly() {
    System.out.println("I can't fly!");
  }

}
