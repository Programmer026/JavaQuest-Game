
public abstract class Player {
    // Instance Variables
    private int Health;
    private int Score;
    private String name;
    // Constructir
    public Player (){
        Health = 10;
        Score = 0;
    }
    //getter and setter methods
    public String getName(){
        return name;
    }
    public int getHealth(){
        return Health;
    }

    public void setName(String name){
        this.name = name;
    }
    // Abstract class
    public abstract String getSpecialMove();
    public abstract void useSpecialMove();

    // Increment or decrement of score and health method
    public void runSuccess(){
        Score += 1;
    }
    public void playerWins(){
        Score += 2;

    }
    public void playerLoses(){
        Health -= 1;
    }
    public void playerSafe(){
        Score += 1;
    }
    // Overide toString()
    @Override
    public String toString(){
        return"Health: " + Health + "\nScore: " + Score + "\n" + name + "'s special move is '" + getSpecialMove() + "'";
    }



}
