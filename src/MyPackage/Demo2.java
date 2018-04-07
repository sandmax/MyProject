package MyPackage;

public class Demo2 {

	public static void main(String[] args) {
		String s1="javadeveloper";
		String s2="ABC";
		String s3=" sandeep";
		String s4="javadeveloper";
		String s5="java";
		System.out.println("Lenght of the string S1 "+s1.length());
		System.out.println("uppercase"+s1.toUpperCase());
		System.out.println("lowercase"+s2.toLowerCase());
		System.out.println("True if starts  With j "+ s1.startsWith("j"));
		System.out.println("character at 2 "+s3.charAt(2));
		System.out.println("index of e "+s3.indexOf("e"));	
		System.out.println("substring of  "+s3.substring(0, 4));
		System.out.println("substring of  "+s3.substring(3, 7));
		System.out.println("substring of  "+s3.substring(3));
		System.out.println("substring of  "+s3.trim());
		System.out.println("replace hava with php  "+s4.replaceAll("developer", "coder"));
		System.out.println("Contains develop  "+s4.contains("develop"));
		
		String s="qspider is a institution";
		String[] word=s.split("\\s");
		for (String ele:word)
		{
			System.out.println(ele);
		}
		
		String sa="SANDEEP";
		String sb="SSANDEEP";
		char[] eleca=sa.toCharArray();
		for(char elem:eleca)
		{
			System.out.println(elem);
		}
		
		System.out.println(sb.compareTo(sa));

	}

}
