import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int a;
        String name,s1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number here:");
        a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name here");
        name = scanner1.nextLine();

        System.out.println("Your number is "+ a +"\nand your name is "+ name);

        Scanner scanner2 = new Scanner(System.in);

        String s = scanner2.nextLine();

        s1 = s.replaceAll("\\D+","");
        System.out.println(s1);


    }

}
