import java.util.Scanner;

public class PrintDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        System.out.println("Enter regular: ");
        int age = scanner.nextInt();
        boolean regular = scanner.nextBoolean();
        int discount = 0;
        if(age>65){
            discount += 10;
        }else if(age<18){
            discount += 25;
        }
        if(regular) {
            discount += 5;
        }
        System.out.println(discount + "%");
    }
}
