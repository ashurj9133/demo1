package demo11;

public class arrayProgram {
      public static void main(String[]args)
      {
    	  arrayProgram ar=new arrayProgram();
    	 String[] test=ar. myTest();
    	 for(int i=0;i<test.length;i++)
   	  {
   		  System.out.println(test[i]);
   	  }
      }
    	  public String[] myTest() {
    	  String [] test= {"java", "selenium","sql","testing"};
    	  
    	  return test;
      }
}
