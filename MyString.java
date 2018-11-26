public class MyString extends CharSequence,Comparable<CharSequence>{
   private char[]data;
   public MyString(CharSequece s){
     data=char[s.length];
     for (int i=0;i<s.length();s++){
       data[i]=s.charAt(i);
     }
   }
   public char charAt(int index){
     return data[index];
   }
   public  CharSequece subsequence(int start,int end){
     String result="";
     for(int i=start;i<end;i++){
       result+=data[i];
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
   public String  comparable
}
