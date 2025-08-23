package week1;

//public class Day3arrays {
//
//	public static void main(String[] args) {
//		// Array is a Data Structure.
//		//Which stores of same data type.
//		// There are 2 types 1. Single dim, 2. Multi dim
//		int[] age = {42, 56, 84, 36}; //Dynamic Array
//		int[] arr = new int[3]; //Static Array
//	}
//
//}


//public class Day3arrays {
//
//	public static void main(String[] args) {
//		float[] per = {85.3f, 68.2f, 86.3f};
//		float max = per[0];
//		for(int i=0; i<per.length; i++) {
//			if(per[i]>max) {
//				max = per[i];
//			}
//		}
//		System.out.println("Heighest percentage = " +  max);
//	}
//
//}


				//Second Heighest Number in the Array

//public class Day3arrays {
//
//	public static void main(String[] args) {
//		int[] arr = {25, 32, 85, 98, 24, 75, 85, 24, 15, 36};
//		int max = 0;
//		int max2 = 0;
//		
//		for(int i =0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max2 = max;
//				max = arr[i];
//				
//			}
//			else if(arr[i] > max2 && arr[i] != max) {
//				max2 = arr[i];
//			}
//		}
//		System.out.println("max2 is : " + max2);
//	}
//
//}


					//Multi dim Array

//public class Day3arrays {
//
//	public static void main(String[] args) {
//		         // col 0   1   2
//		int[][] arr = {{10,20},  //row 0
//						{30,40,50},      //row 1
//						{60}};           //row2
//		System.out.println(arr[2][0]); //60
//		
//		
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		}
//}


				//Fibinacci using Multi DIM.

//public class Day3arrays {
//
//	public static void main(String[] args) {
//		int n = 10;
//		int[][] arr1 = new int[n][2];
//		
//		arr1[0][0] = 0;
//		arr1[0][1] = 1;
//		
//		arr1[1][0] = 1;
//		arr1[1][1] = 2;
//		
//		for (int i = 2; i < n; i++) {
//            arr1[i][0] = i;
//            arr1[i][1] = arr1[i - 1][1] + arr1[i - 2][1];
//        }
//
//        // Print and calculate sum
//        int sum = 0;
//        System.out.println("Fibonacci Series (starting from 1):");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Index: " + arr1[i][0] + " => Value: " + arr1[i][1]);
//            sum += arr1 [i][1];
//        }
//
//        System.out.println("Sum of the series: " + sum);
//	}
//
//}


public class Day3arrays {

	public static void main(String[] args) {
		//ref r c
//		int[][][] arr = {{{10,20}, {30,40}},    //ref 0
//				{{10,20,30}, {10,20,30}, {10,20,30,40}}}; //ref1
		
		int[][][] arr = new int[2][3][3];
//		System.out.println(arr[1][2][3]); //30
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}





