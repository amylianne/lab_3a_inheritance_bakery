public abstract class Cake {
    protected String name;
    private String baseFlavour;
    private Boolean glutenFree;

    public Cake (String name) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.glutenFree = true;
    }

    public abstract String addIcingLettering();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
    
}
