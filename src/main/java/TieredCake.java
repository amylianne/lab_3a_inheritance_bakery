public class TieredCake extends Cake {

    protected Boolean fondantIcing;

    public  TieredCake (String name, Boolean fondantIcing){
        super(name);
        this.fondantIcing = fondantIcing;
    }
    public String addIcingLettering(){
        return "Happy 1st Birthday Bob!";
    }

}
