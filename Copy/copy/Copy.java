import java.io.*;
public class Copy{

	public static void main(String[] args){
	String myFile = args[0];
	String targetFile = args[1];
	BufferedWriter buffWriter = null;

	try{
		FileReader reader = new FileReader(myFile);
		FileWriter writer = new FileWriter(targetFile);
		BufferedReader buffReader = new BufferedReader(reader);
		buffWriter = new BufferedWriter(writer);
		String line;
		while((line=buffReader.readLine())!=null){
			buffWriter.write(line);
			//buffWriter.newLine();
		
		}
		System.out.println("done");
		
		}
		catch(IOException e){
			System.err.println("Error copying file: " + e.getMessage());
		}
		finally{
			try{
				if(buffWriter!=null){
					buffWriter.close();
				}
			}
			catch(IOException e){
                System.err.println("Error closing writer: " + e.getMessage());
			}
	}

}
}