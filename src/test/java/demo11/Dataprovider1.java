package demo11;

public class Dataprovider1 {
 public static void main(String[]args)
 {
	       Object[][] data=mydata();
	       for(int i=0;i<data.length;i++)
	       {
	    	   for(int j=0;j<data[i].length;j++)
	    	   {
	    	   System.out.print(data[i][j]+" ");
	       } 
	    	   System.out.println();
	       }
 }
	       public static  Object[ ][ ] mydata(){
	    	   Object[] [] data=new Object[2][2];
		       data[0][0]= "admin";
		       data[0][1]=123;
		       data[1][0]="admin1";
		       data[1][1]=145;
		       return data;
	       }
 
}
