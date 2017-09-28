package uk.co.aquaq.challenges.nthprime;

import java.util.ArrayList;
import java.util.List;

public class NthPrime {

    public Long nthPrime(int n) {
        long startAt = 2;
        long current = 2;
        final List<Long> primeList = new ArrayList<>();
        while(primeList.size() < n){
            if(primeList.size() == 0){
                current = startAt;
            }
            if(isPrime(current)){
                primeList.add(current);
            }
            current++;
        }
        return primeList.get(n-1);
    }

    private boolean isPrime(long current) {
        for(long i=current -1; i>=2; i--){
            if(current % i ==0){
                return false;
            }
        }
        return true;
    }
}
