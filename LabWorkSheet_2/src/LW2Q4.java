import java.util.Scanner;

public class LW2Q4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i=0; i<5; i++){
            System.out.println("Enter a number: ");
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }

        int highest = arr[0];
        int second =0;
        for (int i = 1; i < 5; i++) {
            if(highest < arr[i]) {
                second = highest;
                highest = arr[i];
            }else if(second < arr[i] && arr[i] != highest) {
                second = arr[i];
            }
        }

        System.out.println("Second highest number: "+second);

    }
}
