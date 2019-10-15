
public class Healer extends Player {
    // set Healer name
    public Healer (){
        super.setName("This Healer");
    }
    // call to string method
    public String getSpecialMove(){
        return "use sleeping powder";
    }
    // overi=ride annotation to declare private instance variables
    @Override
    public void useSpecialMove(){
        System.out.println(super.getName() + " " + getSpecialMove());
    }
    public String toString (){
        return "Healer's Status: \n" + super.toString();
    }

}
