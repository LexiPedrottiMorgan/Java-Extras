import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.print("Enter something:\n");
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String userInput = scan.next();
        input(userInput);

    }

    public static void input(String userInput){
        System.out.println("You Entered: " + userInput + "\n");
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("That is a number.");
        } else {
            System.out.println("That is not a number.\n");
            System.out.println("This is the input with swapped case:");
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println("\nThis is the input reversed:");
            System.out.println(StringUtils.reverse(userInput));
        }


//  closes userInput
    }

//Closes the class
}
