class ascii{
public static void main(String[] args){
	char c='A';
	if(c>='0' && c<='9'){
	switch(c){
	case('0'):
	System.out.println("0");
	break;
	case('1'):
	System.out.println("I");
	break;
	case('2'):
	System.out.println("II");
	break;
	case('3'):
	System.out.println("III");
	break;
	case('4'):
	System.out.println("IV");
	break;
	case('5'):
	System.out.println("V"); 
	break;
	case('6'):
	System.out.println("VI");
	break;
	case('7'):
	System.out.println("VII");
	break;
	case('8'):
	System.out.println("VIII");
	break;
	case('9'):
	System.out.println("IX");
	break;
	default:
	System.out.println("invalid");
	}

	}
	else{
	System.out.println("Not between 0 to 9");
	}

}
}