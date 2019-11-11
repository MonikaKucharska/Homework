package pl.itacademy.lesson10;

public class Engine {
    private String name;
    private int power;

    public Engine(String name, int power){
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString(){
        return name + " " + power;
    }
}
