import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter N_th tabil:");
        int n = sc.nextInt();
        for(int i =0; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i); 
        }
    }
}
