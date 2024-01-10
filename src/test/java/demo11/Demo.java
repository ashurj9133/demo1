package demo11;

public class Demo {

	public static void main(String[] args) {
		String st1="   java is programming language ";
         System.out.println(st1.trim());
         
         String st2="language";
         System.out.println("s1: "+st2.substring(2));
         System.out.println("s2: "+st2.substring(1,5));
         System.out.println("s3: "+st2.charAt(5));
         System.out.println("s4: "+st2.indexOf('e'));
         System.out.println("s5: "+st1.indexOf('a',3));
         System.out.println("s6: "+st1.indexOf("la"));
         System.out.println("s7: "+st1.indexOf("a",'l'));
	}

}
