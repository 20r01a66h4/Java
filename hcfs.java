class hcf{
public static void main(String[] args){
	int n1=6,n2=8,start=1,min=0,temp=0;
	if(n1<n2)
	min=n1;
	else 
	min=n2; 
	while(start<=min){
	if(n1%start==0 && n2%start==0){
	temp=start;
	}
	start++;
	}
	System.out.println(temp);
		

}
}