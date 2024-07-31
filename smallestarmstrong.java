import java.util.Scanner;
class armstrong2
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),min=9,temp=x,t=9;
	for(;x>0;x=x/10){
	int rem=x%10;
	if(rem<min)
	min=rem;
	}
	x=temp;
	for(;x>0;x=x/10){
	int rem=x%10;
		if(rem!=min)
			if(rem<t)
			t=rem;
	}
	System.out.println(t);
}
}

