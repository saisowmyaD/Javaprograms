import java.io.File;  // importing the File class
import java.io.FileReader; // importing the FileReader class 
import java.io.FileWriter;  // importing the FileWriter class

public class file
{
  public static void main(String[] args) 
  {

    File file = new File("newFile.txt");  // create a file object for the current location
	char[] array = new char[100];
	String data = "This is the data in the output file";
	
    try 
	{

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value)
		  {
        System.out.println("The new file is created.");
		  }
      else
      	{
        System.out.println("The file already exists.");
      }
    }
	
    catch(Exception e) 
	{
      e.getStackTrace();
	}
	try
	{
      
      FileReader input = new FileReader("input.txt");// Creates a reader using the FileReader
      input.read(array);// Reads characters
      System.out.println("Data in the file:");
      System.out.println(array);

      
      input.close();// Closes the reader
    }
	catch(Exception e) 
	{
      e.getStackTrace();
    }
	 
		try
			{
       
	       FileWriter output = new FileWriter("output.txt");// Creates a Writer using FileWriter
	       output.write(data);// Writes string to the file
	       System.out.println("Data is written to the file.");

       
       output.close(); // Closes the writer
     }
     catch (Exception e)
	 {
       e.getStackTrace();
     }
  }
  
}

     