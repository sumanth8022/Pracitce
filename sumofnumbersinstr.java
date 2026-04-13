package com.pack;

public class sumofnumbersinstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="su8282";
		int sum =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				sum = sum + str.charAt(i);
			}
		}
		System.out.println(sum);

	}

}
