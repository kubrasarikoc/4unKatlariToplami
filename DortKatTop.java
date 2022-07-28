import java.util.Scanner;
public class DortKatTop {
    public static void main(String[] args) {
        int n, toplam = 0;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz : ");
            n = inp.nextInt();
            if (n % 4 == 0){
                toplam += n;
            }
        }while ( n % 2 == 0);

        System.out.println("4'ün Katı Olan Sayıların Toplamı : "+ toplam);
    }
}
