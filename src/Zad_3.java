import java.util.Scanner;

public class Zad_3 {
    static  public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder rword = new StringBuilder();

        rword.append(word);
        rword.reverse();

        if(word.contentEquals(rword)==true){
            System.out.println("Twoje slowo jest palindromem ");
        }else{
            System.out.println("Twoje slowo nie jest palindromem ");
        }



    }
}
