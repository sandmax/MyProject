package MyPackage;

public class Demo1 {

	public static void main(String[] args) {
	String s1="abc";
	String s2="cde";
	String s3="abc";
	System.out.println(s1);
	String s4=s1.concat(s2);
	System.out.println(s1);
	System.out.println(s4);
	String s5=new String("ABC");
	String s6=new String("DEF");
	String s7=new String("aBC");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s5.equals(s6));
	System.out.println(s5.equalsIgnoreCase(s7));

	}

}
