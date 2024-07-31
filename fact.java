class factorial{
public static void main(String[] args){
	int n=5,r=3,pro=1,product=1,count=1,start=1,co=1,minus=1;
	int x=n-r;
	while(start<=n){
	pro=pro*start;
	start++;
	}
	while(count<=r){
	product=product*count;
	count++;
	}
	while(co<=x){
	minus=minus*co;
	co++;
	}
	int s=product*minus;
	double ncr=(pro/s);
	System.out.println(ncr);
	

}
}