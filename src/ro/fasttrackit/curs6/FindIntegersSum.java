package ro.fasttrackit.curs6;
// scrieti o functie care primeste un sir de numere intregi si returneaza suma lor

public class FindIntegersSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,-5,3,-7,10,0,-4,8};
        System.out.println(findSum(numbers));
    }

    private static int findSum(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }
        return sum;
    }
}
