package demo11;

public class MethodCalling2 {

	public static void main(String[] args) {
		add(1,1);        //method call statement
		add(1,2);
		add(1,3);
         mul();
	}
      public static void mul()
      {
    	  System.out.println("multiplication       "+ 2*4);
      }
      public static void add(int a,int b)
      {
    	  System.out.println(a-b);
    	  sub(5,7);
    	  
      }
      public static void sub(int a,int b)
      {
    	  System.out.println("substraction    "+   (a-b));
      }
}
