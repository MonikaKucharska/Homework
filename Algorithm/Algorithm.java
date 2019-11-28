package pl.itacademy.lesson13;

import java.util.LinkedHashSet;


public class Algorithm {
    public static void main(String[] args) {

        String str =  "This is a test text";
        str=str.replaceAll("\\s","");
        LinkedHashSet <Character> set = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);

    }
}
