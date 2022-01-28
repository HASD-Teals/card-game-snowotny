public class ClientCard {
    public static void main(String[] args) throws Exception{
        card King_of_Hearts = new card();
        King_of_Hearts.setColor("red");
        King_of_Hearts.setRank("K");
        King_of_Hearts.setSymbol("heart");
        King_of_Hearts.setValue(10);
        King_of_Hearts.setPlayable(true);
        System.out.println("color: " + King_of_Hearts.getColor());
        System.out.println("rank: " + King_of_Hearts.getRank());
        System.out.println("symbol: " + King_of_Hearts.getSymbol());
        System.out.println("value: " + King_of_Hearts.getValue());
        System.out.println("playable: " + King_of_Hearts.getPlayable());
        
    }
}