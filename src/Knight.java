
public class Knight extends Player {
    // set name to Knght
    public Knight (){
        super.setName("This Knight");
    }
    // Override abstract methosd
    @Override
    public String getSpecialMove(){
        return"Slashed with sword";
    }
    @Override
    public void useSpecialMove(){
        System.out.println(super.getName() + " " + getSpecialMove());
    }
    // Override toSring()
    @Override
    public String toString (){
        return "Knight's Status: \n " + super.toString();
    }

}
