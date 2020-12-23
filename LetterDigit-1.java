import java.util.Scanner;
public class LetterDigit {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a character: ");
        character = in.next();

        if (character.length() > 1)
        {
            System.out.println("Not a single character.");
        }
        
        else if (character >= '0' && character <= '9')
        {
            System.out.println("Character is a Digit.");
        }

        else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
        {
            System.out.println("Character is a Letter.");
        }

        else
        {
            System.out.println("Character is Unknown");
        }
    }
}