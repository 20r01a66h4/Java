import java.util.Scanner;
class hcf22
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),temp=0;
	for(int i=1;i<=x;i++){
	if(x%i==0)
	System.out.println("factors"+i);
         temp=i;
	}
System.out.println("hcf is"+temp); 

}
}

