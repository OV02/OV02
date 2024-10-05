import java.util.Scanner;

public class LW2Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of raws: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 1;
        for (int i=0; i<num;) {
            for (int k = 0; k < num; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count = count + 1;
            num = num-1;
        }
    }
}
