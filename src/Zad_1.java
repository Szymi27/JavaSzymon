import java.util.Scanner;

class Zad_1{
    static  public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder rword = new StringBuilder();

        rword.append(word);
        rword.reverse();

        System.out.println("Twoje slowo: " + word);
        System.out.println("Odwrócone slowo: " + rword );
    }
}