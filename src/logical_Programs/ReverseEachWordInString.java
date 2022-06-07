package logical_Programs;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "how are you doing";

//            int lgth=str.length();
		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {

			System.out.print(words[i] + " ");

		}

	}

}
