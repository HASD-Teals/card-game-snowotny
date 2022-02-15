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

    public Deck(String rank, boolean lowAce, int ace, int numberOfSuits, int cardsPerSuit){
        //TODO
    }
    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public int numberOfCards(){
        return cards.length;
    }
    public Card getCardAt(int position){
        return cards[position];
    }
    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public void shuffle(){
        for(int i=0; i<this.numberOfCards();i++){
            int swapIndex = (int) (this.numberOfCards()*Math.random());
            Card temp = this.getCardAt(i);
            this.getCards()[i] = this.getCardAt(swapIndex);
            this.getCards()[swapIndex] = temp;
        }
    }
}