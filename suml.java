import java.util.Scanner;
class Suml{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt() , sum = sc.nextInt();
	for(int i=0;i<=n;i++){
	sum=sum+i;
	}
	System.out.println("Sum of n natural numbers:"+sum);
	
}
}
