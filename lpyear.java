import java.util.Scanner;
class lpyear
{
public static void main(String[] args){ 
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt(),y=sc.nextInt();
	for(;x<=y;x++){
	if((x%4==0 && x%100!=0)||x%400==0)
	System.out.println("leap year "+x);
	else
	System.out.println("not a leap year "+x);
	}
	

}
}

