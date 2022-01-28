public class card {
    private String color;
    private String rank;
    private String symbol;
    private int value;
    private boolean playable;

    public card(){
        this.color = "";
        this.rank = "";
        this.symbol = "";
        this.value = 0;
        this.playable = false;
    }

    public card(String color, String rank, String symbol, int value, boolean playable){
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = 0;
        this.playable = playable;
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
    public static void toString(boolean playable, int value, String rank, String color){
        
    }
}
