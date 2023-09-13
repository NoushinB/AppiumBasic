package noushinTest.Appium;

public class coreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String[] name= {"Noushin","Farzad","Babak"}; for(int i=0;i<name.length;i++) {
		 * System.out.println(name[i]); }
		 * 
		 * 
		 * for(String s:name) { System.out.println(s); }
		 */

		
		int[] arr= {1,2,4,5,6,7,8,9,10,122};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
