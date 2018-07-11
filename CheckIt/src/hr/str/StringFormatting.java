package hr.str;

public class StringFormatting {

    public static void main(String[] args) {
	String s = " Hello %s, how are you today %s. %d to go";
	s = String.format(s, "Sun", "Thursday",6);
	System.out.println(s);
    }

}
