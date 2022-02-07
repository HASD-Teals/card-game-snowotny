package src;
public class Deck {
    // PROPERTIES
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

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }
}
