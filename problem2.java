// Create your class here; don't forget the main method
public class Problem2 
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("Enter your first and last name:");
        firstName = keyboard.next ();
        lastName = keyboard.next ();
        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);
    }
}

