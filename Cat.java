package pl.itacademy.lesson7;

public class Cat {
    private String name;
    private boolean isHungry;

    Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean getIsHungry(){
        return isHungry;
    }

    public void eat (String str){
        if(isHungry){
            System.out.println("Tom is not hungry ");
            isHungry=false;
        }
        else {
            System.out.println("Tom is eating "+ str);
            isHungry=true;
        }
    }

    public void sleep(int num){
            System.out.println("Tom is going to sleep for "+ num +" hours");
            isHungry=false;
    }

    public void play(String str){
        System.out.println("Tom is playing around with " + str);
    }
}
