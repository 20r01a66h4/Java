class fizz{
public static void main(String[] args){
	int n=15,start=1;
	while(start<=n){
	if(start%3==0 && start%5==0){
	System.out.println(start+"fizz buzz");
	}
	else if(start%3==0){
	System.out.println(start+"fizz");
	}
	else if(start%5==0){
	System.out.println(start+"buzz");
	}
	else{
	System.out.println(start);
	}
	start++;
	}
   

}
}