class operator{
public static void main(String[] args){
	int a=10,b=20;
	 char ch='-';
	switch(ch){
	case('+'):
	System.out.println("Addition:"+(a+b));
	break;
	case('-'):
	System.out.println("Subtraction:"+(a-b));
	break;
	case('*'):
	System.out.println("multiplication:"+(a*b));
	break;
	case('/'):
	System.out.println("Division:"+(a/b));
	break;
	case('%'):
	System.out.println("remainder:"+(a%b)); 
	break;
	default:
	System.out.println("invalid");
	}

}
}