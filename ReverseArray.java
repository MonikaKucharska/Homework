import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"Monika","Ewa","Anna"};
        for(int i = array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
