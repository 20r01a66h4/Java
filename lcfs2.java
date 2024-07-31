class lcfs2{
public static void main(String[] args){
	int n1=6,n2=8,min=0,temp=0;
	if(n1<n2)
	min=n1;
	else 
	min=n2;
		System.out.println(min);
	while(min>=2){
	if(n1%min==0 && n2%min==0){
	temp=min;
	System.out.println(temp);
	}
	min--;
	}
	//System.out.println(temp);
		
	

}
}