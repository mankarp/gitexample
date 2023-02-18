package String;

public class reverse_string {

	public static void main(String[] args) {

		String s="noon";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
