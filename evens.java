class evensf{
public static void main(String[] args){
	int n=10,start=1,sum=0,pro=1;
	while(start<=10){
	if(n%start==0){
	   if(start%2==0)
		sum=sum+start;
	   else
		pro=pro*start;
	}
	start++;
	}
System.out.println(sum);

System.out.println(pro);
}
}