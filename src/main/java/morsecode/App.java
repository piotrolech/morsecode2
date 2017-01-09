package morsecode;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){

        System.out.println("Podaj rodzaj operacji: 1 - szyfrowanie, 2 - deszyfrowanie");
    int operacja;
    Scanner scanner = new Scanner(System.in);

    operacja = scanner.nextInt();


        System.out.println("Wprowadź tekst do tłumaczenia: !");

    String szyfr;
    Scanner scanner2 = new Scanner(System.in);
    szyfr = scanner2.nextLine();

        if (operacja == 1) {
    szyfruj(szyfr);
} else if (operacja == 2) deszyfruj(szyfr);
        else {
    System.out.println("Wprowadziłeś zły kod operacji");
}

}

    public static void szyfruj(String string) {

    }

    public static void deszyfruj(String string) {

    }
}
