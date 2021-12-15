package Recursion.gCD;

public class gcD {
	int findGCD(int a,int b) {
		if(a<0 || b<0)
			return -1;
		if(b==0)
			return a;
		
		return findGCD(b, a%b);
			
	}

}
