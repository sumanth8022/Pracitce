package com.pack;

public class VowelsorConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "string".toLowerCase();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.println("vowels");
			}
			else {
				System.out.println("consonants");
			}
		}

	}

}
