import java.util.*;

public class Exercise06_18 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string for password: ");
                String pwd=input.nextLine();

        if (isValidPassword(pwd)) {
            System.out.println("Valid password");
        }
        else {
            System.out.println("Invalid password");
        }


    }

    //check if it's Valid password
    public static boolean isValidPassword(String pwd)
    {
        boolean blIsValid;
        // if these all match up the valid password
        blIsValid=isLenght(pwd) && isLettersAndDigits(pwd) && isTwoDigits(pwd);
        return blIsValid;
    }



    //check the length which is at least 8
    public static boolean isLenght(String password)
    {
        return password.length()>=8;
    }


    //check if letters and digits only
    public static boolean isLettersAndDigits(String password)
    {
        for(int i=0; i<password.length();i++)
        {
            if(!Character.isLetterOrDigit(password.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    //Check at least two digits
    public static boolean isTwoDigits(String password)
    {
        int count=0;
        for(int i=0; i<password.length(); i++)
        {
            if(Character.isDigit(password.charAt(i)))
            {
                count++;
            }
            if(count>=2){
                return true;
            }
        }
        return false;
    }

}