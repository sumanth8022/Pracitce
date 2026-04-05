package com.pack;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 153;
int org = n ;
int temp = n;
int dig = 0;
int sum =0;
while(temp !=0) {
	dig++;
	temp = temp / 10;
}
temp = n;
while(temp !=0) {
	int digit = temp % 10;
	sum = (int) (sum + Math.pow(digit, dig));
	temp =temp/10;
}
if(sum == org) {
	System.out.println("armstrong number");
}
else {
	System.out.println("Not a armstrong number");
}

	}

}
