import java.util.Scanner;
class powers
{
public static void main(String[] args){ 
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=1;i<=x;i++){
	int s=(int)Math.sqrt(i);
	int w=(int)Math.pow(s,2);
	if(w==i)
        System.out.println("perfect square " +i);
       else
        System.out.println("not a perfect square" +i);

	}
}
}

