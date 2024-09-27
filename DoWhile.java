import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
    
        String enteredPassword;
    
        do{
            System.out.println("Enter the password: ");
            enteredPassword = sc.nextLine();
    
            if(!enteredPassword.equals(correctPassword)){
                System.out.println("Please try again");
            }
        } while(!enteredPassword.equals(correctPassword));
    
        System.out.println("True password");   
    }
}
