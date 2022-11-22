import interfaces.ICount;

public class TieredCake extends Cake implements ICount {

    protected Boolean fondantIcing;

    public  TieredCake (String name, Boolean fondantIcing){
        super(name);
        this.fondantIcing = fondantIcing;
    }
    public String addIcingLettering(){
        return "Happy Birthday!";
    }

    public String addIcingLettering(String birthdayPerson){
        return "Happy Birthday " + birthdayPerson;
    }

    public String countNumberOfSlices(int number){
        return this.name + " has " + number +" slices.";
    }

}
