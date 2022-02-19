//package src;
public class CardGameClient {
    public static void main(String[] args) throws Exception {
       Deck deck1 = new Deck();
       Deck deck2 = new Deck();
       deck1.toString2(Deck.card);
       deck1.shuffle();
       deck2.shuffle();
       int tracker = 0;
       for(int i=0;i<deck1.numberOfCards() && i<deck2.numberOfCards();i++){   
           if(deck1.getCardAt(i).equals(deck2.getCardAt(i))){
               tracker++;
           }
       }
       System.out.println("This is how many matches there were: " + tracker);

    }
}
