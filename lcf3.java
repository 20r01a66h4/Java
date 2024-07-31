import java.util.Scanner;
class lcf3
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),temp=0;
	for(int i=2;x>=i;x--){
		if(x%i==0)
		temp=i;
	}
System.out.println(temp);
}
}

