package ro.fasttrackit.curs6;
import java.util.*;

/**
 *  scrieti o functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu ajutorul
 *  obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.
 */
public class DonationsTarget {
    public static void main(String[] args) {
        int target = 100;
        getTheTarget(target);
    }

    private static void getTheTarget(int target){
        Scanner console = new  Scanner(System.in);
        double donatedSum = 0;

        do{
            System.out.println("Please introduce the sum you wish to donate: ");
            double donation = console.nextDouble();
            donatedSum = donatedSum + donation;

        } while (donatedSum < target);

        System.out.println("Thank you for helping us to reach our donation target!");
    }
}
