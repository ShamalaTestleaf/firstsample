package loginJav;

public class primenumbsid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printing ODD numbers 1-11
		
		int loopVal;
		int endValue=11;
		int oddNum;

		for(loopVal=1;loopVal<endValue;loopVal++)
		{
			oddNum = loopVal%2;		
			if(oddNum==1)
			{
				System.out.println("ODD NUMBER" +loopVal);
				
			}
		
		/*
		int  n = 45;
		int primenum, flag = 0;
			
		for(int i=2;i<n;i++)
		{
			if(i%2==0){
			flag =1;
			break;
			//primenum = j+i;
			//System.out.println("this is prime" +primenum);
			
		}	
		
	
	
		if (flag ==0)
		System.out.println("this is a prime number" +i);
	
*/
}
}

}