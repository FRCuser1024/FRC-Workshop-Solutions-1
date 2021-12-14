import java.util.Scanner;

public class Workshop1Project3MadLibs {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please type an adjective");
        String ans1 = in.nextLine();
        System.out.println("Please type an adjective");
        String ans2 = in.nextLine();
        System.out.println("Please type a noun");
        String ans3 = in.nextLine();
        System.out.println("Please type a noun");
        String ans4 = in.nextLine();
        System.out.println("Please type a plural noun");
        String ans5 = in.nextLine();
        System.out.println("Please type a game");
        String ans6 = in.nextLine();
        System.out.println("Please type a plural noun");
        String ans7 = in.nextLine();




        System.out.println("A vacation is when you take a trip to some " + ans1 + " location with your " + ans2 + " family. Usually you go to some place that is near a " + ans3 + " or up on a/an " + ans4 + ". A good vacation place is one where you can ride " + ans5 + " or play " + ans6 + " or go hunting for " + ans7 + ".");
    }
}