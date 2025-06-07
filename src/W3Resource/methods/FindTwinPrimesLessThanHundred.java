package W3Resource.methods;

import java.security.spec.RSAOtherPrimeInfo;

public class FindTwinPrimesLessThanHundred {

    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        for (int i = 2; i<=number/2; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 100;
        for (int i = 2; i< number; i++){
            if (isPrime(i) && isPrime(i+2)){
                System.out.printf("(%d, %d)\n",i, i+2);
            }
        }
    }
}
