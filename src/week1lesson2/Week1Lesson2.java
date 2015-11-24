package week1lesson2;

public class Week1Lesson2 {

	public static void RemoveDups(String[] arr) {
		int newarlen = arr.length;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				int dup = 0;
				if (arr[i].equals(arr[j]) && arr != null) {
					arr[j] = null;
					dup++;
				}
				if(dup > 1){
					newarlen -= dup;
					}
			}
			
		}
		String[] newarray = new String[newarlen];
		int j = 0;
		for(int i = 0; i < arr.length -1 ; i++)
		{
			if(arr[i] != null){
				newarray[j] = arr[i];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "horse", "dog", "cat", "horse", "dog" };
		System.out.println("In second lesson!");
	}
}
