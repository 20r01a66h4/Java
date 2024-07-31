class nested{
public static void main(String[] args){
	
	for(int i=11;i<=20;i++){
			int sum=0;
			System.out.print(i+"sum of numbers ");
		for(int j=i;j>0;j=j/10){
			int rem=j%10;
			sum=sum+rem; 
			
			}
			System.out.print(sum);
			System.out.println();
				}
	}
	}