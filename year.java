class leap{
public static void main(String[] args){
	int start=1900,end=2024;
	while(start<=end){
	if(start%4==0 && start%100!=0 ||start%400==0){
	System.out.println(start+ "It is a leap year");
	}
	
	start++;
	}

}
}