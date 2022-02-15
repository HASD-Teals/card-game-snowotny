package src;
public class Card {
    private String color;
    private String rank;
    private String symbol;
    private int value;
    private boolean playable;
    private Card[] card;
    
    public Card(){
        this.color = "";
        this.rank = "";
        this.symbol = "";
        this.value = 0;
        this.playable = false;
    }

    public Card(String color, String rank, String symbol, int value, boolean playable){
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = value;
        this.playable = playable;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Card){
            Card otherCard = (Card)other;
            return (this.getValue() == otherCard.getValue()) && 
            (this.getColor().equals(otherCard.getColor())) && 
            (this.getRank().equals(otherCard.getRank())) && 
            (this.getSymbol().equals(otherCard.getSymbol()));
        }else{
            return false;
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
 
}