
public class UniqueChar{
	/*
	Implement an algorithm to determine if a string has all unique characters. 
	What if you can not use additional data structures?
	*/
	public static boolean isUniqueChar(String str){
		int check = 0;
		int len = str.length();
		for(int i = 0; i < len; i++){
			int val = str.charAt(i) - 'a';
			if((check & (1 << val)) > 0) return false;
			check |= 1 << val;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUniqueChar(args[0]));
	}

}