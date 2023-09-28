import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Dave", 7);
        Scanner scan = new Scanner(System.in);
        debbie.greeting("Neel");
        debbie.weather();
        System.out.println("Enter the number of feet to convert to meters: ");
        int feet = scan.nextInt();
        System.out.printf("The number of %s feet to meters is %.2f%n", feet, debbie.convertFeetToMeters(feet));
        debbie.favoriteNumber(7);
        System.out.printf("The sum of 3, 2, and 5 is %s%n", debbie.addNumbers(3,2,5));
        System.out.println(debbie.square(7));
        debbie.favoriteActivity("cook");
        System.out.println(debbie.goodbye());

    }
}
