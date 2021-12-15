package Recursion.sumOfSeries;

public class sumOf {
	int sumOfSeries(int n) {
		if(n<0) 
			return -1;
		if(n==1)
			return 1;
		
		return n+sumOfSeries(n-1);
	}
}
