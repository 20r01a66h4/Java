import java.util.Scanner;
class armstrongs
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int num=sc.nextInt(),sum=0,temp=num,count=0;
for (;num>0;num=num/10){
	int rem=num%10;
	count++;
}
num=temp;
for (;num>0;num=num/10){
	int rem=num%10;
	sum=sum+(int)Math.pow(rem,count);
}

System.out.println(sum==temp ? "armstrong" : "not a armstrong");
}
}
