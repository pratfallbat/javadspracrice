import java.io.BufferedReader;
import java.io.FileReader;

public class Fileread  {
public static void main(String[]args) throws Exception{
        FileReader file = new FileReader("C:/Users/home/IdeaProjects/java practic ds/src/readme.txt");
        BufferedReader reader=new BufferedReader(file);
        String text="";
        String line= reader.readLine();
        while(line != null){
        text+=line;
        line=reader.readLine();
        }
    System.out.println(text);
        }
}
