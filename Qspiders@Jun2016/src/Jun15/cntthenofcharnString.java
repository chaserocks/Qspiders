package Jun15;

public class cntthenofcharnString {
	public static void main(String[] args) {
		//count the no.of characters present in the String.
		//1st way:
		String str="abc";
		
		int v=str.length();
		System.out.println(v);
		
		//2nd way
		String str1="cba";
		char[] a=str1.toCharArray();
	int b=a.length;
	System.out.println(b);
	 
		//3rd way: enhanced for loop
		char[] t=str.toCharArray();
		int w=t.length;

		int i=0;
		for(char r: t)
		{
			i++;
		}
		System.out.println(i);
	}

}
