import java.util.Scanner;
class hello
{
public static void main(String[] args){ 
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt(),c=sc.nextInt(),r=(n-c),pro=1,product=1,products=1;
	for(int i=1;i<=n;i++){
	pro*=i;
	}
	for(int i=1;i<=c;i++){
	product*=i;
	}
	for(int i=1;i<=r;i++){
	products*=i;
	}
	int s1=(pro/(product*products));
	System.out.println(s1);
	
	

}
}

