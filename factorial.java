import java.util.Scanner;
class factorial
{
public static void main(String[] args){ 
	Scanner sc= new Scanner(System.in);
	int x=sc.nextInt(),pro=sc.nextInt();
	for(int i=x;i>=1;i--){
	pro=pro*i;
	
	}
	System.out.println(pro);
	


}
}

