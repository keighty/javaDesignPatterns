package ducks;

public class Quack implements QuackBehaviour {

  public Quack() {
  }

  @Override
  public void quack() {
   System.out.println("Quack!");
  }

}
