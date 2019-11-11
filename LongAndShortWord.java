package pl.itacademy.lesson10;

import java.util.Arrays;

public class LongAndShortWord {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestWorld("For given text find the longest and the shortest words")));
        System.out.println(Arrays.toString(shortestWorld("For given text find the longest and the shortest words")));
    }
    public static String[] longestWorld (String str){
        String[] array = str.split(" ");
        String longest = array[0];
        String result = "";

        for(int i=0; i<array.length;i++){
            if(array[i].length()>longest.length()){
                longest=array[i];
            }
        }

        for (int i=0; i<array.length;i++){
            if (array[i].length()==longest.length()){
                result+=array[i]+" ";
            }
        }
        result.trim();
        return result.split(" ");
    }
    public static String[] shortestWorld (String str){
        String[] array = str.split(" ");
        String shortest = array[0];
        String result = "";

        for(int i=0; i<array.length;i++){
            if(array[i].length()<shortest.length()){
                shortest=array[i];
            }
        }

        for (int i=0; i<array.length;i++){
            if (array[i].length()==shortest.length()){
                result+=array[i]+" ";
            }
        }
        result.trim();
        return result.split(" ");
    }
}
