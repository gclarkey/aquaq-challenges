package uk.co.aquaq.challenges.nthprime;

public class Driver {

    public static void main(String args[]){
        final NthPrime nthPrime = new NthPrime();

        System.out.println(6+"th prime is: " + nthPrime.nthPrime(6));
        System.out.println(10001+"th prime is: " + nthPrime.nthPrime(10001));
    }
}
