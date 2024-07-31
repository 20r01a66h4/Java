1> class leap{
public static void main(String[] args){
	int n=1900;
	if((n%4==0 && n%100!=0)||n%400==0)
	System.out.println("It is a leap year");
	else
	System.out.println("It is not a leap year");

}
}
//output 
C:\Users\ADMIN\OneDrive\Desktop\testsat>javac leapyear.java

C:\Users\ADMIN\OneDrive\Desktop\testsat>java leap
It is not a leap year

2>
class Alphabet{
public static void main(String[] args){
	char ch='a';
	if (ch>='A' && ch<='Z' || ch>='a' && ch<='z' )
	System.out.println("Alphabet");
	else if(ch>='0' && ch<='9' )
	System.out.println("Digit");
	else
	System.out.println("special character");

}
}
//output 
C:\Users\ADMIN\OneDrive\Desktop\codinghub>javac alphabets.java

C:\Users\ADMIN\OneDrive\Desktop\codinghub>java Alphabet
Alphabet

3>
class insures{
public static void main(String[] args){
	String s="Unmarried", gender="female"; 
	int age=32;
	
	if(s=="Unmarried" && gender=="male" && age>=30)
	System.out.println("Male is eligible for insurance");
	else if(s=="Unmarried" && gender=="female" && age>=25)
	System.out.println("female is eligible for insurance");
	else if(s=="married")
	System.out.println("DRiver is eligible for insurance");
	else
	System.out.println("Not eligible for insurance");
	}
}
//output 
C:\Users\ADMIN\OneDrive\Desktop\codinghub>javac insurance.java

C:\Users\ADMIN\OneDrive\Desktop\codinghub>java insures
female is eligible for insurance

