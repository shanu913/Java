
public class RevString {

	public static void main(String[] args) {
		String str = "test", reverse = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);

		if (str.equals(reverse)) {
			System.out.println("palind");
		} else {
			System.out.println("np");
		}
	}

}
