import java.io.*; 
import javax.swing.*; 
public class Write
{    
	public static void main(String[] args) throws IOException  
	{      
     
	  try         
	{        
		 PrintWriter outputStream =new PrintWriter(new FileOutputStream("names.txt",true));    
		String name; 
		 for (int count = 1; count <= 5; count++)
		 {   
			 name = JOptionPane.showInputDialog(null,"Enter name");   
			 outputStream.println(name);    
	       }      
      outputStream.close(); 
	 }      
   
  catch (IOException e)  
  {         
  System.out.println("IO ERROR");   
  }                  
	   
} 
}

	
