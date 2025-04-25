package day7;

public class MinMaxinArray {

	public static void main(String[] args) {
		//int[] a = {34,12,67,89,2};
		int[] a = {34,12,67,89,2,400,-50};
		int min =0; int max =0;
		for(int i =0;i < a.length; i++) {
			if (a[i] > min) {
				max =a[i];
			}
			min =a[i];
			}
		System.out.println("Minimum =" + min + " " + "Maximum ="+ max);
		}

	}


