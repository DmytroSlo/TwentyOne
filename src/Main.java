import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Zaczynamy grać?[Y/N]: ");
    String decyz = scan.nextLine();

    Random randomKart = new Random();

    int res = 0;
    int start = 0;

    if(decyz.equals("Y")){
        while(true) {
            start = randomKart.nextInt(1,10);
            res += start;
            if(res > 21) {
                break;
            }
            else{
                System.out.print("Masz: " + res + "\nChczesz kontynować?[Y/N]: ");
                String dec1 = scan.nextLine();
                if (dec1.equals("N")) {
                    break;
                }
            }
        }

        int resKomp = 0;
        int round = randomKart.nextInt(1, 4);

        for(int i = 0; i <= round; i++) {
            start = randomKart.nextInt(1, 10);
            resKomp += start;
        }

        if(res > resKomp && res < 21)
            System.out.println("Wygrałeś!!! Twój oponent miał tylko: " + resKomp);
        else if(res < resKomp && resKomp < 21)
            System.out.println("Przegrałeś!!! Twój oponent miał: " + resKomp);
        else if(res == resKomp)
            System.out.println("Poruwne! Karta przeciwnika: " + resKomp);
        else if(res < resKomp && resKomp > 21)
            System.out.println("Wygrałeś!!! Twój oponent miał za dużo: " + resKomp);

    }else
        System.out.println("Konieć!");
    }
}