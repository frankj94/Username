import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner user_name = new Scanner(System.in);
        String name;
        System.out.println("What is your first name?");
        name = user_name.next();

        String age;
        System.out.println("Hi " + name + " what is your age?");
        Scanner user_age = new Scanner(System.in);
        age = user_age.next();

        System.out.println("Wow, " + age + " is really old! How much do you make a month " + name + " ?");

        String pay;
        Scanner user_pay = new Scanner(System.in);
        pay = user_pay.next();
        System.out.println();

        System.out.println(pay + " is good for a " + age + "year old!!!");
    }
}
