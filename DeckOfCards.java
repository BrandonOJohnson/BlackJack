/* Deck of Cards
 * Brandon Johnson
 */

import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
  
  ArrayList<Card> deck;
  int numDealt = 0;
 
  /**Default constructor that facilitates new cards
   */
 
  public DeckOfCards() {

    this.deck = new ArrayList<Card>();
    
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.deck.add(new Card(s, r));
      }
    } 
  }
  
  /** Distributes card to both dealer and player
   * @return nextCard distributes the subsequent card
   */
  public Card deal() {
    Card nextCard = this.deck.get(this.numDealt);
    this.numDealt++;
    return nextCard;
  }
  
   /** shuffles the order which the cards are arranged
   */
  
  public void shuffle() {
  
    Random rand = new Random();
    
    numDealt = 0;
    
    int b;
    Card temp;
    for (int a = 51; a >=0; a--){
      temp = this.deck.get(a);
      
      b = rand.nextInt(52);
      
      this.deck.set(a, this.deck.get(b));
      this.deck.set(b, temp);
    }
  }
}

      



      
  


      
    



