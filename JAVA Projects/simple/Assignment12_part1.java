import java.util.Scanner;

class Assignment12_Part1 {
    private static int counter;

    public static void main(String[] args) {
        counter = 0;

        System.out.print("Please enter two integers space seperated: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a, b));
        System.out.printf("Total%4d recursive calls", counter);
        input.close();
    }

    private static int gcd(int a, int b) {
        counter++;
        if (b == 0) return a;
        if (a == 0) return b;
        if (a % b == 0) return b;
        else return gcd(b, a % b);

    }

}