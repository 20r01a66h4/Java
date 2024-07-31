import java.util.Scanner;
class Even_odd
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),sum=0,pro=1;
	for(int i=1;i<=x;i++){
	if(x%i==0){
		if(i%2==0){
		sum=sum+i;
		}
		else{
		pro=pro*i;
		}
		}
	}
System.out.println(sum);

System.out.println(pro);
}
}

