package com.pack;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1503;
int temp = num;
int org = num;
int digit=0;
while(num!=0)
{
	digit++;
	num=num/10;
}
System.out.println("totl digits are " + digit);
System.out.print(num);
System.out.println();
int sum=0;
while(temp!=0) {
	int rem = temp%10;
	int power =1;
	

for (int i=0;i<digit;i++) {
	
	power*= rem;
}
sum+=power;
temp = temp/10;
}
if(sum==org) {
	System.out.println("armstrng");
}
else
{
	System.out.println("Not an Armstrong number");
}

	}
	

}
