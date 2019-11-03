package pl.itacademy.lesson7;

public class Engine {
    private String name;
    private int horsepower;
    private int capasity;
    private boolean isStarted;

    Engine(String name, int horsepower, int capasity){
        this.name = name;
        this.horsepower = horsepower;
        this.capasity = capasity;
    }

    public void setisStarted(Boolean bool) {
        this.isStarted = bool;
    }

    public Boolean getisStarted() {
        return this.isStarted;
    }

    public String getName() {
        return name;
    }

    public int getHorsepower(){
        return horsepower;
    }

    public int getCapasity(){
        return capasity;
    }


}
