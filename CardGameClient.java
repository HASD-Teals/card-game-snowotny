package src;
public class CardGameClient {
    public static void main(String[] args) throws Exception {
       Deck deck1 = new Deck();
       Deck deck2 = new Deck();
       for(int i=0;i<deck1.length;i++){
           System.out.println(deck1.getCardat(i));
       }
       for(int i=0;i<deck2.length;i++){
           System.out.println(deck2.getCardat(i));
       }
    }
}
