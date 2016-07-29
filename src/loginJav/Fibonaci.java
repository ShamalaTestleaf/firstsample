package loginJav;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 1;
		int k;

		System.out.println(i);
		System.out.println(j);

		
		for(k=0;k<=100;k++)
		{
			
			k= i+j;
			if (k<=100)
			{
			System.out.println(k);
			i=j;
			j=k;
			}
		}
		
					
		
	} 

}
