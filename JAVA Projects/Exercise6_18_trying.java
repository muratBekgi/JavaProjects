import java.util.*;

public class Exercise6_18_trying {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your password:");
        String password=input.nextLine();

        System.out.println(isValidPassword(password)? "Valid": "Invalid");

    }
    // check the length
    public static boolean isLength(String password){
        return password.length()>=8;
    }

    //check if consits letters and digits only
    public static boolean isLetters_and_Digits(String password){

        for (int i=0; i<password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i)))
                return false;
        }
        return true;
    }

    // check if at least 2 digits
    public static boolean is2Digits(String password){

        int countDigits=0;
        for(int i=0; i<password.length(); i++){
            if(Character.isDigit(password.charAt(i))) {
                countDigits++;
            }
            if(countDigits>=2)
                return true;
        }
        return false;
    }

    //check if all three steps are correct
    public static boolean isValidPassword(String password){
        boolean isValid;

        isValid=is2Digits(password) && isLength(password) && isLetters_and_Digits(password);
                return isValid;
    }

}
