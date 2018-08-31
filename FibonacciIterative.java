public class FibonacciIterative implements Fibonacci {

	@Override
	public int fibonacci(int n) {
		int fib = 0;
		int a = 1;
		int temp = 0;
		for(int i = 0;  i < n; i ++){
			temp = a;
			a = fib + a  ;
			fib = temp; 
		
		}
		
		return fib;
	}

}
