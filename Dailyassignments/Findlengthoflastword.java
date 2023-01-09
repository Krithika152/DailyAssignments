package Dailyassignments;

public class Findlengthoflastword {

	public static void main(String[] args) {
		String str = "luffy is still joyboy";
		
		String[] split = str.split(" ");
		int length=split.length;
		System.out.println(split[length-1].length());
		
	}

}
	
