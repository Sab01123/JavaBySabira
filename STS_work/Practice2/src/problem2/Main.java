package problem2;

public class Main {
	
	public void check(char character) {
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		boolean yes = false;
		for(int i=0; i<consonant.length; i++)
		{
			if(vowels[i]==character) {
				System.out.println(character+" is vowel");
				yes = true;
				break;
			}
			else if(consonant[i]==character) {
				System.out.println(character+" is consonant");
				yes = true;
				break;
			}
//			else if(vowels[i]!=character && consonant[i]!=character){
//				System.out.println("error");
//			}
		}
		if(yes==false)
		{
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Main obj = new Main();
	      obj.check('z');
	}

}
