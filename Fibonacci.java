public static int Fibonacci(int num) {
	int result = 0;

	if(num == 1) {
		result = 1;
	} else if (num == 2) {
		result = 1;
	} else if (num >= 3) {
		result = Fibonacci(4) + Fibonacci(5);
	}

	return result;
}
