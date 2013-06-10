
public class PrimeNumbers {
	public static void main(String[] args) {
				
		final int NUMBER_OF_PRIMES = (int) Math.round(Math.sqrt(50));
		int[] primes = new int[NUMBER_OF_PRIMES];
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0, number = 2;
		
		System.out.println("The first 50 prime numbers are \n");
		
		while (count < NUMBER_OF_PRIMES) {					
			boolean isPrime = true;			
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor ==0) {
					isPrime = false;
					break;
				}
			}			
			if (isPrime) {
				primes[count] = number;
				count++;
			}			
			number++;			
		}
		
		while (count < 50) {					
			boolean isPrime = true;			
			for (int i = 0; i < NUMBER_OF_PRIMES; i++) {
				if (number % primes[i] == 0) {
					isPrime = false;
					break;
				}
			}			
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + "\t");
				}
			}			
			number++;			
		}
		
	}
}