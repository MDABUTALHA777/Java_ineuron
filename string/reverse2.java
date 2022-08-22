package first;


public class reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// iNeuron ---> norueNi
		
		String s1="Think Twice";
		String s2="";
		String s3="";
		
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
	
		//System.out.println(s2);

		
		String a[]=s2.split(" ");
	
		for(int j=a.length-1;j>=0;j--)
		{
			s3=s3+a[j]+ " ";
	    }
		System.out.println(s3.toLowerCase());
	   
}
}
