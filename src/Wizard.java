
public class Wizard extends Player {
    // Set Wizard name in constructor
    public Wizard (){
        super.setName("This Wizard");
    }
    // Overide abstract classes
    @Override
    public String getSpecialMove(){
        return"Cast a Spell";
    }
    @Override
    public void useSpecialMove(){
        System.out.println(super.getName() + " " + getSpecialMove());
    }
    // Override toString()
    @Override
    public String toString (){
        return"Wizards's Status: \n" + super.toString();
    }

}
