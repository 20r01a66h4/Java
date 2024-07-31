class Months{
public static void main(String[] args){
	String s="February";
	int n=1900;
	if (s=="june" || s=="march"||s=="May"||s=="july"||s=="August"||s=="october"||s=="december"){
	System.out.println("31days");
	}
	else if(s=="april" || s=="june"||s=="september"||s=="november"){
	System.out.println("30days");
	}
	else if(s=="February"){
	      if((n%4==0 && n%100!=0) ||n%400==0)
		System.out.println("29 days");
	      else
		System.out.println("28 days");
	}
	else{
	System.out.println("Invalid");
	}

}
}