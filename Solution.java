import java.util.Scanner;


public class Solution {



    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        if(N % 2 == 1){
            System.out.println(" Weird");
        }
        else{
            if (N>=2 && N<=5) {
                System.out.println("Not Werid");
            }
            else if (N>=6 && N<=20) {
                System.out.println("Werid");
            }
            else{
                System.out.println("Not Werid");
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
