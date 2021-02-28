
import java.util.Scanner;
import java.util.*;
public class Gravitacija{

    public static void main(String[] args){
    System.out.println("OIS je zakon!");

    Scanner scan = new Scanner(System.in);
    double visina = scan.nextDouble();

    double a = Math.pow(10, -11);
    double b = Math.pow(10, 24);
    double c = Math.pow(10, 6);

    double pospesek = (6.674 * a * 5.972 * b) / ((6.371 * c + visina) * (6.371 * c + visina));

    System.out.println("Gravitacijski pospesek ima vrednost " + pospesek + "m/s^2 pri podani nadmorski višini: " + visina + ".");
    }
}
