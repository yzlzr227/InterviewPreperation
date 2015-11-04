package com.lzr.Amazon;

public class Section_1 {
	public static int[] sortArray(int arr[]){
		int len = arr.length;
		int small, pos, i, j ,temp;
		for (i = 0; i <= len - 1; i++){
			for (j =i; j < len; j++){
				temp = 0;
				if (arr[i] < arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

	public static int[] sortArray2(int arr[]){
		int i, max, location, j, temp, len = arr.length;
		for (i = 0; i < len; i++){
			max = arr[i];
			location = i;
			for (j = i; j < len; j++){
				if (max < arr[j]){
					max = arr[j];
					location = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[location];
			arr[location] = temp;
		}
		
		return arr;
	}
	
	public static void printPattern(int num){
		int i, print = 0;
		if (num % 2 == 0){
			print = 0;
			for ( i = 0; i < num; i++){
				System.out.println(print + " ");
				print += 2;
			}
//			print += 2;
		}else{
			print = 1;
			for (i = 0; i < num; i++){
				System.out.println(print + " ");
				print += 2;
			}
//			print += 2;
		}
	}
	
	public static int[] replaceValues(int[] arr) {
		int i,j, len = arr.length;
		if (len % 2 == 0){
			for (i = 0; i < len;i++){
				arr[i] = 0;
			}
		}else{
			for (j = 0; j < len; j++)
				arr[j] = 1;
		}
		
		return arr;
	}

	public static int[] reverseArray(int arr[]){
		int i, temp, originalLen = arr.length;
		int len = originalLen;
		for (i = 0; i < originalLen / 2; i++){
			temp = arr[len -1];
			arr[len - 1] = arr[i];
			arr[i] = temp;
			len -= 1;
		}
		return arr;
	}

	public static int[] removeElement(int[] arr, int index){
		int i, j, len = arr.length;
		if (index < len){
			for (i = index; i < len - 1; i++)
				arr[i] = arr[i + 1];
			int rarr[] = new int[len - 1];
			for (i = 0; i < len - 1; i++){
				rarr[i] = arr[i];
			}
			return rarr;
		}
		return arr;
	}

	public static int countDigits(int num){
		int count = 0, n = num;
		while (n != 0){
			n = n / 10;
			count++;
		}
		return (num % count);
	}
}
