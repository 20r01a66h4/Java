import java.util.Scanner;
class tabel 
{
public static void main(String[] args){ 
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=10;i>=1;i--){
	   System.out.println(x+"X"+i+"="+(x*i));
	}

}
}

