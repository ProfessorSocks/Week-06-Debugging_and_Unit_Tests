package FinalCodingProject;

public class App {
    
    Card card = new Card();
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player Camille = new Player("Camille");
        Player Sxnny = new Player("Sxnny");
        //Card card = new Card("Jack","Hearts" );
        // System.out.println(card.getName());
        // deck.fillDeck();
        

        deck.getDeck();

        deck.shuffle();


        for(int i = 0;i < 52; i++ ){
            if(i % 2 == 0){
                Camille.draw(deck);
                // System.out.println(deck.draw());
            }else{
                Sxnny.draw(deck);
                // System.out.println(deck.draw());
            }
        }

        // Sxnny.describe();
        // Camille.describe();

        for(int i = 0; i < 26; i++){
            Card card1 = Camille.flip(i);
            Card card2 = Sxnny.flip(i);
            card1.describe();
            card2.describe();
            if(card1.getValue() > card2.getValue()){
                System.out.println(Camille.getName() + " has won the round \n ");
                Camille.incrementScore();
            }else if(card2.getValue() > card1.getValue()){
                System.out.println(Sxnny.getName() + " has won the round");
                Sxnny.incrementScore();
            }

        }

        if(Camille.getScore() > Sxnny.getScore()){
            System.out.println("Camille has won the game");
        }else if(Sxnny.getScore() > Camille.getScore()){
            System.out.println("Sxnny has won the game");
        }else{
            System.out.println("It was a tie");
        }

    }

}
