import java.util.Scanner;
class duplicate
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),max=0,temp=x,t=0,s=0,count=0;
	for(;x>=0 ; x=x/10){
	int rem=x%10;
	if(count>2){
	break;
	}
	else if(rem==0){
	count=count+1;
	x=temp;
	}
	else if(rem>max){
	t=max;
	max=rem;
		
	}
	else if (rem>t){
	if(rem!=max)
	t=rem;
	}
	}


System.out.println(max);
System.out.println(t);


		

}
}

