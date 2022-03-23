import java.util.Scanner;

class InOut{
    static  public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a;
        int d; int g=0;
        char litera;
        System.out.println("Podaj wyraz:");
        a = scanner.nextLine();
        d = a.length()-1;
        litera = a.charAt(d);
        for(int i=0;i<d+1;i++)
        {
            if(litera==a.charAt(i))
            {
                g++;
            }
        }
        System.out.println("W wyrazie" + a + " litera "+ a.charAt(d) + " występuje "+ g);
    }
}