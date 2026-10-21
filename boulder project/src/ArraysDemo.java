import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args){
        int arr[][] = new int[2][2];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your 2D array is : ");
        for (int i = 0; i < 2; i++) {
            for(int j=0;j<2;j++){
                System.out.println("Array "+i+" "+j+" "+arr[i][j]);
            }

        }




    }
}
