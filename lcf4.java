import java.util.Scanner;
class lcf4
{
public static void main(String[] args){ 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),y=sc.nextInt(),min=0,temp=0;
if (x<y)
min=x;
else
min=y;
	for(int i=2;min>=i;min--){
	if(x%i==0 && y%i==0)
	temp=i;
	
	}
System.out.println(temp);

}
}