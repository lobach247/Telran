import java.util.Scanner;

public class TaskExSecond {


    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter number: ");

        int i=m.nextInt();
        if (i > 0){
            System.out.println("Number is positiv: " + i);
        }else{
            if (i==0){
                System.out.println("Number is: " + i);
            }else {
                System.out.println("Number is negative: ");
            }
    }

}
}
