package demo11;

public class ararayobject2 {
    public static void main(String[]args)
    {
    	Object[] a=myTest();
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.println(a[i]);
    	}
    }
       public static Object[] myTest()
       {
    	   Object[] a=new Object[3];
    	   a[0]=12;
    	   a[1]=23;
    	   a[2]="dog";
    	   return a;
       }
}
