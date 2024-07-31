class ascii
{
	public static void main(String[] args) {
	    char c='c';
	    int a=c;
	    if (a>=65 && a<=90){
	        int s1=(a+32);
	         char c1=(char) s1;
	        System.out.println(c1);
	        
	        
	    }
	     else if(a>=97 && a<=122){
	          int s1=(a-32);
	         char c1=(char) s1;
	        System.out.println(c1);
	        
	    }
	    else{
	        System.out.println("invalid");
	    }
	        
	    
	   
	}
}