package FinalCodingProject;

public class App {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player Camille = new Player("Camille");
        Player Sxnny = new Player("Sxnny");
        deck.fillDeck();

        System.out.println(deck.getDeck());

        deck.shuffle();

        for(int i = 0;i < 52; i++ ){
            if(i % 2 == 0){
                Camille.draw(deck);
                System.out.println(deck.draw());
            }else{
                Sxnny.draw(deck);
                System.out.println(deck.draw());
            }
        }

        Sxnny.describe();
        Camille.describe();

        for(int i = 0; i < 26; i++){
            Card card1 = Camille.flip(i);
            Card card2 = Sxnny.flip(i);
            if(card1.getValue() > card2.getValue()){
                System.out.println(Camille.getName() + " has won this round \n ");
            }else if(card2.getValue() > card1.getValue()){
                System.out.println(Sxnny.getName() + " has won the round");
            }

        }

    }

}
