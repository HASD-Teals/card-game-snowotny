import src.Card;
import src.Deck;

public class TestDeck{
    public static void main(String[] args){
        Deck testDeck = new Deck();
        testDeck.shuffle();
        for(Card c : testDeck.getCards()){
            System.out.println(c);
            System.out.println("-----------------------------");
        }
    }
}