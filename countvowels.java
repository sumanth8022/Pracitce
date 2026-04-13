package com.pack;

public class countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aeomnv".toLowerCase();
		char[] ch = str.toCharArray();
		int count =0;
		for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		count++;	
		}
		
		}
		System.out.println(count);

	}

}
