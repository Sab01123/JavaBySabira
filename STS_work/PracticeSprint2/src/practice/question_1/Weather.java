package practice.question_1;

public class Weather {

	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
if(isRaining==true || isSnowing== true || temperature<10f ) {
	System.out.println("Let's stay home");
}
else {
	System.out.println("Let's go out!");
}
	}

}
