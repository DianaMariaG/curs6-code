package ro.fasttrackit.curs6;
// Scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare

public class FindOdds {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,-5,-2,-10,15,-7};
        System.out.println(findOddNumbers(numbers));
    }

    private static int findOddNumbers(int[] numbers){
        int count = 0;
        for (int number : numbers){
            if(number%2 != 0){
                count ++;
            }
        }
        return count;
    }
}
