import java.io.*;

public class File_input_output {

	public static void main(String[] args) throws IOException {
		String file = "Input.txt";
		String line = null;
		String Out_file = "Output.txt";
		

       	FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
            
        FileWriter fileWriter = new FileWriter(Out_file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while((line = bufferedReader.readLine()) != null) {System.out.println(line);
             bufferedWriter.write(line);  
        }
        bufferedReader.close();  
        bufferedWriter.close();
	}
	
}