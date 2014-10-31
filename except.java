import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class except

{
	public static void main( String args [] ) throws IOException
	{
		File directory = new File("C:\\Users\\Vallabh\\Desktop\\dump");      
		File[] myarray;  
		myarray=new File[184];
		myarray=directory.listFiles();
		for (int j = 0; j < myarray.length; j++)
		{
			File path=myarray[j];
			FileReader fr = new FileReader(path);
			//System.out.println(myarray[j]);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while (br.ready()) {
				s = br.readLine() ;
				if(s.indexOf("Data Issue") != -1)
					System.out.println(myarray[j]);
				
			}
		}

	}
}