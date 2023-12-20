package FinalCodingProject;

public class Player {
    private Card[] hand = new Card[26];
    private Integer score;
    private String name;

    public Player(String name){
        score = 0;
        this.name = name;
    }

    //methods
    public void describe(){
        System.out.println(name +" has the following cards \n");
        for(int i = 0; i < hand.length; i++){
            System.out.println(hand[i].getName());
        }
    }

    public Card flip(int i){
        Card topCard = hand[i]; 
        return topCard;
    }

    int count = 0;
    public void draw(Deck deck){
        hand[count] = deck.draw();
        count += 1;
    }

    public void incrementScore(){
        this.score += 1;
    }

    //getters / setters
    public String getName() {
        return name;
    }


}
