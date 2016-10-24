import java.util.Random;

public class Die {
 
  private int value;  
  private int numberOfFaces;
  private Random rng;

  public Die(int numberOfFaces) {
    this.numberOfFaces = numberOfFaces;
    this.rng = new Random();
  }

  public Die() {
    this.numberOfFaces = 6;
    this.rng = new Random();
  }
  
  public void roll() {
  
    this.value = this.rng.nextInt(this.numberOfFaces) + 1;
  }

  public int getValue() {
    return this.value;
  }
  
}