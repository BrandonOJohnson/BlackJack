// A class to represent a single playing card
/* Card
 * Brandon Johnson
 */
public class Card {
 
  Suit suit;
  Rank rank;
  
  /**
   * @param s is the suit if the card
   * @param r is the rank of the respective card
   */ 
  public Card(Suit s, Rank r) {
    this.suit = s;
    this.rank = r;
  }
  
  /**Gets the suit
   * @return returns the value of the Suit for the card
   */ 
  public Suit getSuit() {
    return this.suit; 
  }
  
  /**
   * @return returns the value of the Rank for the card
   */ 
  public Rank getRank() {
    return this.rank; 
  }
  
   /**
   * @return returns the value of the Rank for the card
   */ 
  public String toString() {
    return this.rank + " of " + this.suit; 
  }
  
}