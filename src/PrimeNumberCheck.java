
/*
* File: PrimeNumberCheck.java
* Author: Edward Benzenberg
* Date: 6/19/2017
* Purpose: to check if a integer is Prime
*/

public class PrimeNumberCheck {

    // declare variables
    private int number;

    // constructor
    PrimeNumberCheck(int number){
        this.number = number;
    }

    // isPrime method - returns true if number is prime / false if not prime
    public static boolean isPrime(int number){

        if(number%2 == 0) {
            return false;
        }else{
            for(int i = 3; i*i <= number; i+=2){
                if(number%i == 0){
                    return false;
                }
            }
        }
         return true;
    } // end isPrime method

} // end PrimeNumberCheck class
