package logical_Programs;

public class RemoveJunkSpecilcharactersFromString {

	public static void main(String[] args) {

		String str = "$#$%^$$ special char";
		
		str = str.replaceAll("[^a-zA-Z0-9 ]","");
		
		System.out.println(str);
	}

}
