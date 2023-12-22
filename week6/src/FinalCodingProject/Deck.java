package FinalCodingProject;

import java.util.Collections;

import javax.management.loading.PrivateClassLoader;

public class Deck {
    
    private Card[] deck = new Card[52];
    private Integer topCard = -1;

    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        int j = 0;
        for(int i = 0;i  < suits.length;i++){
            for(String rank : ranks){
                System.out.println(rank + suits[i]);
                deck[j] = new Card(rank,suits[i]);
                j += 1;
            }
        }
        
    }


    //getters/setters
    public void getDeck() {
        for(Card card  : deck){
            System.out.println(card.describe());
        }
    }

    //methods

    // public void fillDeck(){
    //     for(int i = 0; i < suits.length;i++){
    //         for(String rank : ranks){
    //             Card card = new Card(rank,suits[i]);
    //             deck[i] = card;
    //         }
    //     }
    // }

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
        return this.deck[topCard];
    }


}
