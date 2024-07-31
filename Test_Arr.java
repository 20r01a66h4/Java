class Test_Arr{
public static void main(String[] args){
int a[]=new int[] {10,20,30,40,50,60,70};
for(int x=0;x<a.length-1;x++){ 
	if(x==a.length-1)
      {
   int t=a[x];
   a[x]=a[x-1];
   a[x-1]=t;
     
       }
  else{
	int t=a[x];
       	 a[x]=a[x+1];
          a[x+1]=t;
      }
	System.out.println(a[x+1]);
  }

	

}

}
