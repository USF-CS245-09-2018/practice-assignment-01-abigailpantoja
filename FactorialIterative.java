public class FactorialIterative implements Factorial {

	@Override
	public int factorial(int n) {
			int fac = 1;
		for(int i = 0; i < n; i ++){
			fac = fac * (n-i);

		}
		return fac;

}

}
