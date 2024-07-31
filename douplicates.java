import java.util.Scanner;
class duplicate
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),max=0,temp=x,t=0;
	for(;x>0 ; x=x/10){
	if(x==0){
	x=temp;
	}
	else if(x>max){
	int rem=x%10;
	max=rem;		
	}
	}

	System.out.println("max1:"+max);

}
}

