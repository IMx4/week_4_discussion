

/**
 * Created by BPCT on 6/19/2017.
 */
public class PrimeNumberCheck {

    // declare variables
    private int number;

    // constructor
    PrimeNumberCheck(int number){
        this.number = number;
    }

    // getter
    public int getNumber() {
        return number;
    }

    // setter
    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime(){

        // declare local variable
        int number = getNumber();

        if(number%2 == 0) {
            return false;
        }

        for(int i = 3; i*i <= number; i+=2){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    } // end isPrime method

} // end PrimeNumberCheck class
