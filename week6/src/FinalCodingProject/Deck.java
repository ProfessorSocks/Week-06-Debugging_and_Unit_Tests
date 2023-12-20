package FinalCodingProject;

import java.util.Collections;

import javax.management.loading.PrivateClassLoader;

public class Deck {
    
    private Card[] deck = new Card[52];
    private Integer topCard = -1;

    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

    Deck() {
        for(int i = 0; i < suits.length;i++){
            for(String rank : ranks){
                deck[i] = new Card(rank,suits[i]);
            }
        }
        
    }


    //getters/setters
    public Card[] getDeck() {
        return deck;
    }

    //methods

    public void fillDeck(){
        
    }

    public void shuffle(){
        for (int i = 0; i < 1000; i++) {
            int j = (int)(Math.random()*52);
            int k = (int)(Math.random()*52);
            Card tmpCard = deck[j];
            deck[j] = deck[k];
            deck[k] = tmpCard;
        }
    }

    public Card draw(){
        topCard +=1;
        return deck[topCard];
    }


}
