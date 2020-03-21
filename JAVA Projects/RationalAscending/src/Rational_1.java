import java.util.Scanner;

class Rational   implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private long numerator = 0;
    private long denominator = 1;

    /** Construct a rational with default properties */
    public Rational() {
        this(0, 1);
    }

    /** Construct a rational with specified numerator and denominator */
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    /** Find GCD of two numbers */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    /** Return numerator */
    public long getNumerator() {
        return numerator;
    }

    /** Set numerator */
    public void setNumerator(long n)
    {
        numerator = n;
    }

    /** Return denominator */
    public long getDenominator() {
        return denominator;
    }

    /** Set denominator */
    public void setDenominator(long d)
    {
        denominator = d;
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /** Multiply a rational number to this rational */
    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /** Divide a rational number from this rational */
    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((Rational)(other))).getNumerator() == 0)
            return true;
        else
            return false;
    }



    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
    //import java.util.Comparator;


        // Method to compare RatNumber objects. Order is ascending
        public int compare(Rational a, Rational b)
        {
            return (int) ((a.numerator * b.denominator)-(a.denominator * b.numerator));
        }

}

public class Rational_1 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        int random=(int)(Math.random()*10-1+1);
        int random2=(int)(Math.random()*20-10+1);
        Rational r1 []  = {new Rational(random,random2)};

        for(int i=0; i<6;i++){
            System.out.println(r1[i]);
        }






    }
}
