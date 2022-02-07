package src;
import java.util.Scanner;
public class Deck {
    // PROPERTIES
    Scanner scanner = new Scanner(System.in);
    private Card[] cards;

    // DEFAULT DECK CONSTANTS
    private final static String[] DEFAULT_SYMBOLS = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private final static String[] DEFAULT_RANKS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    // CONSTRUCTORS
    public Deck() {
        cards = new Card[52];
        int cardIndexCounter = 0;
        for(int i = 0; i<DEFAULT_SYMBOLS.length; i++){
            for(int j =0; j<DEFAULT_RANKS.length;j++){
                String currSymbol = DEFAULT_SYMBOLS[i];
                String currRank = DEFAULT_RANKS[j];
                String currColor = currSymbol.equals("Diamonds") || currSymbol.equals("Hearts") ? "Red" : "Black";
                int currValue = j + 1;
                cards[cardIndexCounter]= new Card(currColor, currRank, currSymbol, currValue, true);
                cardIndexCounter++;
            }
        }
    }

    public Card(String rank, boolean lowAce, int ace, int numberOfsuits, int numberOfcards){
        System.out.println("How many suits?");
        numberOfranks = scanner.nextInt();
        System.out.println("How many cards per suit");
        numberOfcards = scanner.nextInt();
        
        if(lowAce = true){
            ace = 1;
        }else if(lowAce = false){
            ace = 10;
        }
    }
    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public Card[] numberOfcard(){
        return Card.length;
    }
    public Card[] getCardat(){
        System.out.println("What number of card would you like to select from the deck?");
        int random = scanner.nextInt();
        return Card[random].length;
    }
    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public void shuffle(Card[] cards){
        
    }
    // METHODS
    public void shuffleCards(Card[] cards) {
        // Shuffle this.cards in a random order
    }
}
