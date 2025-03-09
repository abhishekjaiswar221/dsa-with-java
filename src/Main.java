import java.util.Scanner;

class Main {

    public static void print(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of test cases:");
        Scanner test = new Scanner(System.in);
        int t = test.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println("Enter the number:");
            Scanner num = new Scanner(System.in);
            int n = num.nextInt();
            print(n);
        }
    }
}