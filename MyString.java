public class MyString implements CharSequence{
	     data=new char[s.length()];
	     for (int i=0;i<s.length();i++){
	       data[i]=s.charAt(i);
	     }
	   }
	   public char charAt(int index){
	     return data[index];
	   }
	   public  CharSequence subSequence(int start,int end){
	     String  result="";
	     for(int i=start;i<end;i++){
	       result+=result+data[i];
	     }
	     return result;
	   }
	   public String toString(){
	     String result="";
	     for(int i=0;i<data.length;i++){
	       result+=data[i];
	     }
	     return result;
	   }
	   public int length() {
		   int size=0;
		   for(int i=0;i<data.length;i++) {
			   size++;
		   }
		   return size;
	   }
	  
		   
	
}


