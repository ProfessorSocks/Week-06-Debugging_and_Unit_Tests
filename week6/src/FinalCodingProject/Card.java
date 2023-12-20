package FinalCodingProject;

public class Card {
    
    private Integer value;
    private String name;

    // calls
    public Card(String rank,String suit){
        this.name = rank + " of " + suit;
        if(rank == "Jack"){
            this.value = 11;
        }else if(rank == "Queen"){
            this.value = 12;
        }else if(rank == "King"){
            this.value = 13;
        }else if(rank == "Ace"){
            this.value = 14;
        }else{
            Integer newRank = Integer.parseInt(rank);
            this.value = newRank;
        }
    }


    //getters and setters

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer v){
        this.value = v;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }


    //misc

    public String describe(){
        return "\n Name is " + name + " and Value is " + value;
    }

    

}
