import java.util.Scanner;
class hellos
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
	for(int i=1;i<=x;i++){
	System.out.println(i%2==0 ? i+"even": i+"odd");
	}
}
}

