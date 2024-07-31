import java.util.Scanner; 
class factros
{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in); 
	int x=sc.nextInt(),count=0;
	for(int i=1;i<=x/2;i++){
	if(x%i==0)
	count=count+1;
	
	}
if(count==1)
System.out.println("prime number");
else
System.out.println("not a prime number");

}
}

