import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Helpers
{
    /**
     * Returns whether a large number is a prime number or not using probability primality tests
     * @param number The number to check for primality
     * @return True if prime, false if not
     */
    public boolean isPrime ( long number )
    {
        if ( number > 1 && number <= 3 ) return true;
        // If is even or factor of 3
        if ( number % 2 == 0 || number % 3 == 0 || number < 2 )
            return false;

        for ( long i = 5; i * i <= number; i += 6 )
        {
            if ( number % i == 0 || number % ( i + 2 ) == 0 )
                return false;
        }
        return true;
    }

    /**
     * Checks whether a number is a palindrome by converting a to a character array, reversing it and comparing the two.
     * @param number The number to check if palindromic
     * @return True of false if palindromic or not
     */
    public boolean isPalindromic ( int number )
    {
        String numberAsString = String.valueOf ( number );
        int length = numberAsString.length ();
        List < Character > initial = numberAsString.chars ().mapToObj ( c -> ( char ) c ).toList ();
        List < Character > reversed = new ArrayList <>();
        for ( int i = length; i - 1 >= 0; i-- )
        {
            reversed.add ( initial.get ( i - 1 ));
        }
        return initial.equals ( reversed );
    }
}
