package ro.fasttrackit.curs6;
import java.util.*;
/**Scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
 * Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita.
 * Cand ajungem la suma dorita afisam un mesaj de succes.
 * Functia va primi si un numar maxim de donatori. Cand acesta se termina, campania se va incheia.
 */

public class MaximumDonators {
    public static void main(String[] args) {
        int target = 100;
        int maximumDonators = 3;
        getTheTarget(target, maximumDonators);
    }

    private static void getTheTarget(int target, int maximumDonators){
        Scanner console = new  Scanner(System.in);
        double donatedSum = 0;
        int countDonators = 0;

        do{
            System.out.println("Please introduce the sum you wish to donate: ");
            double donation = console.nextDouble();
            donatedSum = donatedSum + donation;
            countDonators ++;

        } while ((donatedSum < target) && (maximumDonators > countDonators)); // nu ||

        System.out.println("Thank you for helping us to reach our donation target!");
    }
}


