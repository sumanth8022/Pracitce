package com.pack;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,6,7,8};
		int n = arr.length;
		int even =0;
		int odd=0;
		String eeven = " ";
		String ood = " ";
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even++;
				eeven = eeven + " "+ arr[i];
			}
			else {
				odd++;
				ood = ood + " "+arr[i];
			}
			
		}
		System.out.println("even count : " + even);
		System.out.println("even count elements " + eeven);
		System.out.println("odd count  : " +  odd);
		System.out.println("even count elements " + ood);
	}

}
