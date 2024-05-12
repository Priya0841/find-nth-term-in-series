class Solution {
    static int findNthTerm(int N) {
        // Calculate the Nth term using the formula
        return (N * (N + 1)) / 2;
    }
}

Explanation:

We calculate the Nth term using the formula 
N×(N+1) , where 
N is the input number.
This formula represents the sum of the first N natural numbers, which is the desired Nth term in the series.
Now, the findNthTerm() function will correctly return the Nth term of the given series for any given input N.

For the first example, when N = 4 
the formula 

N×(N+1)/2 gives us 10.
