package Recursion.powerOf;

public class findPowerOf {	
	int powerOf(int n, int p)
	{
		if(p<0)
			return -1;
		if(p==0 || n==1)
			return 1;
		if(p==1)
			return n;
		
		return n*powerOf(n, p-1);
	}
}
