import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

String start = args[0];
String end = args[1];
try
(BufferedReader read = new BufferedReader(new FileReader(start));
BufferedWriter writer = new BufferedWriter(new FileWriter(end))){

String line;
while((line = read.readLine()) !=null)
{
	writer.write(line);
	writer.newLine(); 
	
}
System.out.println("File copied successfully.");
}

catch(IOException e)

{
System.err.println("Error copying file: " + e.getMessage());
}

}
}
