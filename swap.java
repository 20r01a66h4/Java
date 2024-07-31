class swapping{
public static void main(String[] args){
	/*int a=10,b=20,temp=0;
	System.out.println("before swapping"+temp+"\n"+"a is "+a+"\n"+"b is "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping"+temp+"\n"+"a is "+a+"\n"+"b is "+b) */
	int a=10,b=20;
	System.out.println("before swapping"+"\n"+"a is "+a+"\n"+"b is "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping"+"\n"+"a is "+a+"\n"+"b is "+b);
	
	


}
}