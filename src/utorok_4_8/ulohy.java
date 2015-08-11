package utorok_4_8;

public class ulohy {

	public static String Palindrome(String vstup)
	{
		StringBuilder answer=new StringBuilder(vstup.length());
		for(int i=vstup.length()-1;i>=0;i--)
		{
			answer.append(vstup.charAt(i));
		}
		return answer.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Palindrome("TAK ja som blbec"));
		System.out.println(Math.PI);
		System.out.println(Math.pow(9,2));
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.floor(5.90));
		System.out.println(Math.ceil(5.90));
		System.out.println(Math.max(5, 8));
		System.out.println(Math.abs(-18));
		System.out.println(Math.E);
		System.out.println(Math.round(Math.PI*1000)/1000.000);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("time"+System.currentTimeMillis());
		System.out.println("int"+Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		int number=127;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toOctalString(number));
		System.out.println(Integer.toHexString(number));
		String a="";
		String b="ab";
		long time1=System.currentTimeMillis();
		for(int i=0;i<10000000;i++)
		{
			a.concat(b);
		}
		long time2=System.currentTimeMillis();
		long time3=time2-time1;
		System.out.println("concat "+time3);
		a="";
		b="ab";
		time1=System.currentTimeMillis();
//		for(int i=0;i<90000;i++)
//		{
//			a+=b;
//		}
		time2=System.currentTimeMillis();
		time3=time2-time1;
		System.out.println("klasicke "+time3);
		b="ab";
		StringBuilder aa=new StringBuilder();
		time1=System.currentTimeMillis();
		for(int i=0;i<10000000;i++)
		{
			aa.append(b);
		}
		time2=System.currentTimeMillis();
		time3=time2-time1;
		System.out.println("append "+time3);
	}

}
