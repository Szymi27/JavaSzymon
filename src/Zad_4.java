import java.util.Scanner;

public class Zad_4 {
    static  public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] c = word.toCharArray();

        int sum = 0;

        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        System.out.println("Suma cyfr w zadniu : " + sum);

    }
}
