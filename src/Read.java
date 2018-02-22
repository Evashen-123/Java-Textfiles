import java.io.*;
public class Read 
{   
	public static void main(String[] args) throws IOException
	{   
		try  
		{    
			
			BufferedReader inputStream = new BufferedReader(new FileReader("names.txt"));  
			String name = inputStream.readLine();     
			while (name != null)        
			{             
				System.out.println(name);     
				name = inputStream.readLine(); 
			}             
			inputStream.close(); 
			}            
		catch(EOFException eof)
		{        
		System.out.println("End of File ERROR");      
		} 
		 catch(FileNotFoundException fnf) 
		 {    
		 System.out.println("File not found ERROR");  
		 }            
		catch (IOException e)   
		{        
		System.out.println("IO ERROR");   
		} 	
	}
}