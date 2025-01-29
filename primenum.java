public class primenum
{
    // method to check if a number is prime
    public static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int count = 0;

        // loop 1 to 1000
        for (int i = 1; i <= 1000; i++) 
        {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }

        // print
        System.out.println("PRIME NUMBERS BETWEEN 1 AND 1000");
        System.out.println("Total number of prime numbers between 1 and 1000: " + count);
    }
}
