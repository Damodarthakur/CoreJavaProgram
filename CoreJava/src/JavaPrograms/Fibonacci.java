package JavaPrograms;

class Fibonacci {

	static void fibo(int N) {
		int sum, t1 = 0, t2 = 1;

		for (int i = 1; i <= N; ++i) {
			System.out.print(t1 + " ");

			sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}
	}

	public static void main(String[] args) {

		// Given Number N
		int N = 10;
		fibo(N);
	}

}
