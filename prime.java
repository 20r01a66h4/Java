class prime{
public static void main(String[] args){
	int num=13,start=1,count=0;
	while(start<=num/2){
	if(num%start==0)
	count++;
	start++;
	}
if(count==1)
System.out.println("Prime number");
else
System.out.println("not a Prime number");
	

}
}