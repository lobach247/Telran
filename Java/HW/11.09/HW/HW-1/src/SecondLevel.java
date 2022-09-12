import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number between 1 and 100: ");
        int userNumber=scan.nextInt();
        double remFromDivision=userNumber% 2;
        if (remFromDivision==0){
            System.out.println("you enter paired number");
        }else
            System.out.println("you enter unpaired number");
    }
}
