import src.Card;

public class ClientCard {
    public static void main(String[] args) throws Exception{
        Card Card1 = new Card("red","King","Heart",10,true);
        System.out.println( Card1.toString());
    }
}