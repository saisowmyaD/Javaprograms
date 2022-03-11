public class strings
{
  public static void main(String[] args) 
  {
    String txt = "Hello";
	String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String txt2 = "Please locate where 'locate' occurs!";
	String firstName = "sowmya";
	String lastName = "sai";
	String txt3 = "We are the people \"living\" in the hyderabad.";
	String x = "10";
    int y = 20;
    String z = x + y;
	System.out.println(txt);
	System.out.println("The length of the txt string is: " + txt.length());
	System.out.println(txt.toUpperCase());   
	System.out.println(txt.toLowerCase()); 
	System.out.println(txt2.indexOf("locate")); 
	System.out.println(firstName + " " + lastName);
	System.out.println(txt3);
	System.out.println(z);
  }
}