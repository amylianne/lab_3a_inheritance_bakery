import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<Cake> cakes;

    public Bakery(String name) {
        this.name = name;
        this.cakes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(ArrayList<Cake> cakes) {
        this.cakes = cakes;
    }

    public int countCakes() {
    return this.cakes.size();
    }

    public void addCake(Cake cake){
        this.cakes.add(cake);
    }
}

