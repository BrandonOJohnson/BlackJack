/* Hand Class
 * Brandon Johnson
 */

import java.util.ArrayList;
  
  public class Hand{
  private ArrayList <Card> hand;
  
  /** instantiates a new hand
   */
  public Hand(){
    this.hand = new ArrayList<Card>();
  }
  
  /** 
   * @param c simulates a new card being drawn from a deck
   */ 
  public void addCard(Card c ){
    this.hand.add(c);
  }

  public int getScore() {
    int score = 0;
    int countAces = 0;
    
    for (Card c : this.hand){
      
       if(c.getRank().equals(Rank.TWO)){
        score += 2;
      }
        if(c.getRank().equals(Rank.THREE)){
        score += 3;
      }
        if(c.getRank().equals(Rank.FOUR)){
        score += 4;
      }
        if(c.getRank().equals(Rank.FIVE)){
        score += 5;
      }
       if(c.getRank().equals(Rank.SIX)){
        score += 6;
      }
       if(c.getRank().equals(Rank.SEVEN)){
        score += 7;
      }
        if(c.getRank().equals(Rank.EIGHT)){
        score += 8;
      }
        if(c.getRank().equals(Rank.NINE)){
        score += 9;
      }
        if(c.getRank().equals(Rank.TEN)){
        score += 10;
      }
       if(c.getRank().equals(Rank.JACK)){
        score += 10;
      }
        if(c.getRank().equals(Rank.QUEEN)){
        score += 10;
      }
         if(c.getRank().equals(Rank.KING)){
        score += 10;
      }
         if(c.getRank().equals(Rank.ACE)){
        score += 11;
        countAces++;
      }
    }
    while(score > 21 && countAces > 0){
      score -= 10;
    }
   /**
    * @return score returns the total numeric value of one's hand
    */
    
    return score;
  }
  public Card getFirstCard(){
    return this.hand.get(0);
  }
  
  /** 
   * @return return the values in the hand
   */ 
  public String toString() {
    return " " + this.hand;
  }
}
    
  
  
  