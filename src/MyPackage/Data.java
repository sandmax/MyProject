package MyPackage;

public class Data {

	public static void main(String[] args) {
		SetData.toproperty("C:/test/data.properties", "GENDER", "MALE", "Added Gender");
		SetData.toproperty("C:/test/data.properties", "COUNTRY", "INDIA", "Added Country");
		String data=GetData.fromproperty("C:/test/data.properties","COUNTRY");
		
		System.out.println(data);

	}

}
