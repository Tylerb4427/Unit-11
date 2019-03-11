package Rational;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import static java.lang.System.*;

class Rational implements Comparable<Rational> {

    //add two instance variables

    int num, den;

    public Rational(int n, int d) {
        num = n;
        den = d;
    }

    public Rational() {
    }

    public void setRational(int n, int d) {
        num = n;
        den = d;
    }
    //write two constructors
    //write a setRational method
    //write  a set method for numerator and denominator

    public void add(Rational other) {
        //num1/den1 + num2/den2 
        num = (num * other.getDen() + other.getNum() * den);
        den = (den * other.getDen());

        reduce();
    }

    public void reduce() {
        for (int i = 2; i <= den; i++) {
            if (den % i == 0 && num % i == 0) {
                den /= i;
                num /= i;
                reduce();
            }
        }
    }

    private int gcd(int numOne, int numTwo) {
        for (int i = den; i >= 1; i--) {
            if (den % i == 0 && num % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public Object clone() {
        return new Rational(num, den);
    }

	//ACCESSORS
    //write get methods for numerator and denominator
    public boolean equals(Rational obj) {
        obj.reduce();
        Rational test = new Rational(num, den);
        test.reduce();
        return (obj.getDen() == test.getDen() && obj.getNum() == test.getNum());
    }

    public int compareTo(Rational other) {
        if (equals(other)) {
            return 1;
        } else {
            return -1;
        }
    }

    //write  toString() method
    public String toString() {
        return "Num: " + num + " Den: " + den;
    }

    public int getDen() {
        return den;
    }

    public int getNum() {
        return num;
    }
}
