public class card {
    private String color;
    private String rank;
    private String symbol;
    private int value;
    private boolean playable;
    //private card[] deck = new card[52];
    //private boolean lowAce;
    //private int ace;
    //private int numberOfranks;
    //private int numberOfcards;
/*
    public card(){
        this.color = "";
        this.rank = "";
        this.symbol = "";
        this.value = 0;
        this.playable = false;
        this.lowAce = false;
    }
*/
    public card(String color, String rank, String symbol, int value, boolean playable){
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = 0;
        this.playable = playable;
    }
  /*  public card(card[] deck, boolean lowAce, int ace, int numberOfranks, int numberOfcards) {
        this.deck = deck;
        this.lowAce = lowAce;
        this.ace = ace;
        this.numberOfranks = numberOfranks;
        this.numberOfcards = numberOfcards;
    }

    public card(card[] deck) {
        this.deck = deck;
    }
*/
    public card(String rank, boolean lowAce, int ace, int numberOfranks, int numberOfcards){
        numberOfranks = 4;
        numberOfcards = 13;
        
        if(lowAce = true){
            ace = 1;
        }else if(lowAce = false){
            ace = 10;
        }
    }

    public static void equals(String color, String color2, String rank, String rank2, String symbol, String symbol2, int value, int value2, boolean playable, boolean playable2){
        if (color == color2){
            if(rank == rank2){
                if(symbol == symbol2){
                    if(value == value2){
                        if(playable == playable2){
                            System.out.println("The cards are equal.");
                        }
                    }
                }
            }
        }else{
            System.out.println("The cards are not equal.");
        }
    }

    public String getColor(){
        return color;
    }
    public String getRank(){
        return rank;
    }
    public String getSymbol(){
        return symbol;
    }
    public int getValue(){
        return value;
    }
    public boolean getPlayable(){
        return playable;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void setPlayable(boolean playable){
        this.playable = playable;
    }
    public String toString(boolean playable, int value, String rank, String color){
        String report = "color: " + this.color + "\n" + "rank: " + this.rank + "\n" + "value: " + this.value + "\n" + "playable: " + this.playable;
        return report;
    }
}