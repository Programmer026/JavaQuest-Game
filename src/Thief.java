
public class Thief extends Player {
    // set Thief name
    public Thief (){
        super.setName("This Thief");
    }
    // Override abstract method
    public String getSpecialMove(){
        return"Sneak By";
    }
    public void useSpecialMove(){
        System.out.println(super.getName() + " " + getSpecialMove());
    }
    // Override toString()
    @Override
    public String toString (){
        return"Thief's Status: \n" + super.toString();
    }

}
