package ClassExample;

public class City {
    //private,public,proteced,default


    private String name;
    private long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }


    //constructor ---> Kurucu method
    City(String name, long population)
    {
        this.name = name;
        this.population = population;
    }
    City()
    {
        System.out.println("Default Constructor Class");
    }

}
