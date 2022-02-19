//package src;
public class Deck {
    // PROPERTIES
    private Card[] cards;

    private String symbol;

    private String color;

    private String rank;

    private String value;

    private String playable;

    static Card[] card;

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

    public void makeDeck(String rank, boolean lowAce, int ace, int numberOfSuits, int cardsPerSuit){
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
        @Override
        public String toString(){
            String report = "symbol: " + this.symbol + "\n" + "color: " + this.color + "\n" + "rank: " + this.rank + "\n" + "value: " + this.value + "\n" + "playable: " + this.playable;
            return report;
        }
        public void toString2(Card[] card){
            Deck.card = card;
            for(int i=0; i<card.length; i++){
            System.out.println(card[i]);
            System.out.println("-----------------------------");
        }
    }
}