package Lab1;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trafficlight("red"));

	}
	public static String trafficlight(String str) {
		String str1=null;
		if(str.equals("red")) {
			str1="Stop";
		}
		else if(str.equals("yellow")) {
			str="go";
		}
		else if(str.equals("green")) {
			str="Go";
		}
		return str1;
	}

}
