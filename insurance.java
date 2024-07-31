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