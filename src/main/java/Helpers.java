import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Helpers
{
    /**
     * Returns whether a number is a prime number or not using probability primality tests
     * @param number The number to check for primality
     * @return True if prime, false if not
     */
    public boolean isPrime ( long number )
    {
        // If is 3, is even, or is a square number (has a whole square root)
        if ( number == 3 || number % 2 == 0 || Math.sqrt ( number ) % 1 == 0 ) return false;

        for ( long i = 5; i * i <= number; i += 6 )
        {
            if ( number % i == 0 || number % ( i + 2 ) == 0 )
                return false;
        }
        return true;
    }

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
