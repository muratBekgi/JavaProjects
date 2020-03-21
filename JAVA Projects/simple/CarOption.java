public class CarOption {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner((System.in));

        System.out.println("Choose one of these car Model ");
        System.out.print("Honda   BMW   Lincoln   Toyota\nChoice: ");
        String choice=input.next();

        if(choice.equalsIgnoreCase("Honda")){
            System.out.println("Pick the brand: ");
            System.out.println("Civic   Accord  Fit");
            String choice2=input.next();
            if ((choice2.equalsIgnoreCase("Civic"))){
                System.out.println("Model: "+choice+"\nBrand: "+choice2);
            }
            if ((choice2.equalsIgnoreCase("Accord"))){
                System.out.println("Model: "+choice+"\nBrand: "+choice2);
            }
            if ((choice2.equalsIgnoreCase("Fit"))){
                System.out.println("Model: "+choice+"\nBrand: "+choice2);
            }
        }

        if(choice.equalsIgnoreCase("BMW")){
            //Same as above just change the Brand names and stuff
        }

        if(choice.equalsIgnoreCase("Lincoln")){
            //Same as above just change the Brand names and stuff
        }

        if(choice.equalsIgnoreCase("Toyota")){
            //Same as above just change the Brand names and stuff
        }


    }
}


/*



Trying to code a program that lets the user select pregiven options, and goes into further details.

For an example it would state something like "Choose one of these car brands: Honda, BMW, Lincoln" And if you pick
Honda it will give some examples "Pick from Civic, Accord, Fit" and once selected it'll just display the different
 types of x car model.
 */