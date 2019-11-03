package pl.itacademy.lesson7;

public class MobilePhone {
    private String brand;
    private int model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private boolean freeMemory;

    MobilePhone(String brand, int batteryCapacity, int memory) {
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.freeMemory = true;
        this.batteryAmount = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public int getBatteryAmount(){
        return batteryAmount;
    }

    public int getMemory(){
        return memory;
    }

    public boolean getfreeMemory(){
        return freeMemory;
    }

    public void installApplication(String name, int memory) {
        this.memory -= memory;
        if (this.freeMemory && this.memory > 0) {
            System.out.println("Application " + name + " has been installed on " + this.brand + " Remain memory " + this.memory+" MG");
        } else {
            this.freeMemory = false;
            System.out.println("Application " + name + " can't be installed on " + this.brand + " There are no enough memory");
        }
    }

    public void use(String name, int hour) {
        if (this.batteryAmount < 0) {
            System.out.println("Application " + name + " can't be run on " + this.brand + " Phone discharged");
        } else {
            this.batteryAmount -= (hour * 100);
            if (this.batteryAmount < 0) {
                hour = hour + this.batteryAmount / 100;
                System.out.println("Application " + name + " has been used for " + hour + " hours on " + this.brand +
                        " Phone has been discharged");
            } else {
                System.out.println("Application " + name + " has been ran for " + hour + " hours on " + this.brand +
                        " Remain battery capacity: " + this.batteryAmount+ " mAh");
            }
        }
    }

    public void charge() {
        this.batteryAmount = this.batteryCapacity;
    }
}
