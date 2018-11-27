public class MyString implements  CharSequence,Comparable<CharSequence>{
      private char[]data;
      public MyString(CharSequence s){
         data=new char[s.length()];
        for(int i=0;i<s.length();i++){
             data[i]=s.charAt(i);
            }
       }
       public int length(){
         return data.length;
       }
       public String toString(){
         String result="";
         for(int i=0;i<data.length;i++){
           result+=data[i];
         }
         return result;
       }
       public CharSequence subSequence(int start,int end){
         if(start<0 || end<0 || start>end || end>this.length()){
           throw new IndexOutOfBoundsException();
         }
         String result="";
         for(int i=start;i<end;i++){
           result+=data[i];
         }
         return result;
       }
       public char charAt(int index){
         if(index<0 ||index>=this.length()){
           throw new IndexOutOfBoundsException() ;
         }
         return data[index];
       }
       public int compareTo(CharSequence s){
         if(s==null){
           throw new NullPointerException();
         }
         int minLength;
         if(s.length()<=this.length()){
           minLength=s.length();
         }
         else{
           minLength=this.length();
         }
        for(int i=0;i<minLength;i++){
            if(! (this.charAt(i)-s.charAt(i)==0)){
            return  this.charAt(i)-s.charAt(i);
             }
        }
        if(s.length()==this.length()){
          return 0;
        }
        else{
          return this.length()-s.length();
        }
     }
}
