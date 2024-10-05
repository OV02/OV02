import java.util.Scanner;

public class LW2Q2 {
    public static void main(String[] args) {
        int num;

        while (true){
            System.out.println("Enter a number: ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            int count=0;
            if (num<0){
                System.out.println("Exit programme");
                System.exit(0);
            }else {
                int length = String.valueOf(num).length();
                System.out.println("Number of digit: "+length);
                }

            }

        }
    }

