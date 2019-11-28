package pl.itacademy.lesson13;

import java.util.LinkedHashMap;


public class Algorithm2 {
    public static void main(String[] args) {

        String str = "This is a test text";
        str = str.replaceAll("\\s","");
        int count = 1;

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i =0; i<str.length();i++) {

            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),count);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        System.out.println(map);

    }
}
