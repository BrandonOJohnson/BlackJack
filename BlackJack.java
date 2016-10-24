
/* Black Jack
 * Brandon Johnson
 */
import java.util.Scanner;

public class BlackJack {
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner( System.in );
    
    Hand yourHand = new Hand();
    Hand dealersHand = new Hand();
    DeckOfCards deck = new DeckOfCards();
    boolean yourturn = true;
    boolean dealersturn = true;
    
    deck.shuffle();
    
    System.out.println("I have Kanye-fidence in you. Let's play BlackJack!");
    System.out.println();
    
    yourHand.addCard(deck.deal()); 
    dealersHand.addCard(deck.deal());
    yourHand.addCard(deck.deal());
    dealersHand.addCard(deck.deal());
      
    while (yourturn){
      
      if (yourHand.getScore() == 21){
        System.out.println("You Win!");
        System.out.println("Your score is " + yourHand.getScore());
        System.out.println("Your hand is" + yourHand.toString());
        System.out.println("The dealer's first card is " + dealersHand.getFirstCard());
      
        yourturn = false;
      }
      
      if (yourHand.getScore() > 21){
        System.out.println("your score is " + yourHand.getScore());
        System.out.println("you busted");
        System.out.println("Dealer wins");
        yourturn = false;
        dealersturn = false;
      }
      
      if (yourHand.getScore() < 21){
      
      System.out.println("Your score is " + yourHand.getScore());
      System.out.println("Your hand is" + yourHand.toString());
      System.out.println("The dealer's first card is " + dealersHand.getFirstCard());
      
      System.out.println();
      
      System.out.println("Do you want to hit or stand");
      String answer = scan.next();
        
      if (answer.equalsIgnoreCase("hit")){
            yourHand.addCard(deck.deal());
            //System.out.println("Your score is " + yourHand.getScore());
      }
      if (answer.equalsIgnoreCase("stand")){
          System.out.println("The dealer's hand is" + dealersHand.toString());
          System.out.println("The dealer's score is " + dealersHand.getScore());
          yourturn = false;
        }
      }
    }
    while (dealersturn){
      if (dealersHand.getScore() < 17){
        dealersHand.addCard(deck.deal());
        System.out.println("The dealer's new score is " + dealersHand.getScore());
        System.out.println("The dealer's new hand is " + dealersHand.toString());
      }
      else if (dealersHand.getScore() > 21){
        System.out.println("dealer busted");
        System.out.println("Player wins");
        dealersturn = false;
      }
      else { 
        //System.out.println("dealer stands");hit
   
        if ( dealersHand.getScore() > yourHand.getScore())
          System.out.println("dealer wins");
        
        if ( dealersHand.getScore() < yourHand.getScore())
          System.out.println("You win!");
 
        dealersturn = false;
      }
    }
  }
}
      
 
   

 
        
       
    
      
        


        

  
  