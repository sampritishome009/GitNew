package StringsCheck;

public class reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "madam";
       String t= "";
       
       for(int i =s.length()-1;i>=0;i--) {
    	   t= t+ s.charAt(i);
    	                                   //t(1st it=m because s.charAt(i)=m)
    	                                   //t(2nd it=ma because s.charAt(i)=a)
    	                                   //t(3rd it=mad because s.charAt(i)=d)
    	                                   //t(4th it=mada because s.charAt(i)=a)
    	                                   //t(5th it=madam because s.charAt(i)=m)
    	   
    	   
	}
      // System.out.println(t);
       
       if(s==t)  
       {
    	   System.out.println("Strings are matching");
       }
       else {
    	   System.out.println("Strings are not matching");
       }
       
}
}
