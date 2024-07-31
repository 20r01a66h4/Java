class vowels{
public static void main(String[] args){
	char ch='A';
	int s= int(ch);
	int s1=(a-32);
        char c1=(char) s1;

	
	
	
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	switch(ch){
	case('a'):
	System.out.println("apple");
	break;
	case('e'):
	System.out.println("egg");
	break;
	case('i'):
	System.out.println("iphone");
	break;
	case('o'):
	System.out.println("orange");
	break;
	case('u'):
	System.out.println("umbrella"); 
	break;
	case('A'):
	System.out.println("Apple");
	break;
	case('E'):
	System.out.println("Egg");
	break;
	case('I'):
	System.out.println("Iphone");
	break;
	case('O'):
	System.out.println("Orange");
	break;
	case('U'):
	System.out.println("Umbrella"); 
	break;

	default:
	System.out.println("Invalid");
	}
	}
	else{
	System.out.println("consonant");
	}
}
}