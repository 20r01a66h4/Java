class nested1{
public static void main(String[] args){
	
	for(int i=1;i<=100;i++){
		int count=0;
		for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count++;
						break;
				    }
					}
if(count==0 && i>1){
System.out.println(i+"prime");
}
else{
System.out.println(i+"not a prime");
}
		
				}





	}
	}