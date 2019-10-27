public class LetterPrinter {
    public static void main(String[] args) {
        String str = "Java";
        char[] array = str.toCharArray();
        for(char c : array){
            System.out.print(c + "\n");
        }
    }
}
