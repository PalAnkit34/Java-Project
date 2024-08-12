import  java.util.Scanner;


public class newcalculter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1 sum");
            System.out.println("2 sub");
            System.out.println("3 mul");
            System.out.println("4 div");
            System.out.println ("Choose option:");
            int input1 = input.nextInt();
            if (input1 <= 1) {
                System.out.println("Enter a first Number: ");
                int First_Number = input.nextInt();
                System.out.println("Enter a Second Number: ");
                int Second_Number = input.nextInt();
                int sum = First_Number + Second_Number;
                System.out.println("This is your Addition(+): " + sum);
            } else if (input1 <= 2) {
                System.out.println("Enter a first Number: ");
                int First_Number = input.nextInt();
                System.out.println("Enter a Second Number: ");
                int Second_Number = input.nextInt();
                int sub = First_Number - Second_Number;
                System.out.println("This is your subtract(-): " + sub);
            } else if (input1 <= 3) {
                System.out.println("Enter a first Number: ");
                int First_Number = input.nextInt();
                System.out.println("Enter a Second Number: ");
                int Second_Number = input.nextInt();
                int mul = First_Number * Second_Number;
                System.out.println("This is your multiple(×) : " + mul);
            } else if (input1 <= 4) {
                System.out.println("Enter a first Number: ");
                int First_Number = input.nextInt();
                System.out.println("Enter a Second Number: ");
                int Second_Number = input.nextInt();
                int div = First_Number / Second_Number;
                System.out.println("This is your division(÷): " + div);
            } else;
            
        }
        System.out.println("Thank You😘😘👍👍👍👍👍");
    }
}