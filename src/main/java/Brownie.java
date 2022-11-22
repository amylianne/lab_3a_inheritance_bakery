import interfaces.ICount;

public class Brownie extends Cake implements ICount {
    protected String shapeOfSlice;

    public Brownie (String name, String shapeOfSlice){
        super(name);
        this.shapeOfSlice = shapeOfSlice;
    }
    public String addIcingLettering(){
        return "Congratulations!";
    }

    public String countNumberOfSlices(int number){
        return this.name + " has " + number +" slices.";
    }





}
