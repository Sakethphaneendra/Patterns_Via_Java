import java.util.Scanner;

public class Patterns {
    public static void main(String ar[]){

    // Function to Call 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Pattern1(n);
    }

    static void Pattern1(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }System.out.println();
        }
    }


}
