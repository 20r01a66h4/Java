import java.util.Scanner;
class armstrong
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),max=0,temp=x,t=0;
	for(;x>0;x=x/10){
	int rem=x%10;
	if(rem>max)
	max=rem;
	}
	x=temp;
	for(;x>0;x=x/10){
	int rem=x%10;
		if(rem!=max)
			if(rem>t)
			t=rem;
	}
	System.out.println(t);
}
}

