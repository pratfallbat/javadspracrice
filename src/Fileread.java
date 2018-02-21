import java.io.*;

public class Fileread  {
public static void readfile() throws Exception{
    FileReader file = new FileReader("C:/Users/home/IdeaProjects/java practic ds/src/readme.txt");
    BufferedReader reader=new BufferedReader(file);
    String text="";
    String line= reader.readLine();
    while(line != null){
        text+=line;
        line=reader.readLine();
    }
    reader.close();
    System.out.println(text);

}
    public static void writefile() throws Exception{
    File newfile= new File("C:/Users/home/IdeaProjects/java practic ds/src/writedfiletwo.txt");
        if(newfile.exists()){
            System.out.println("file exist already");
        }
        else {
            newfile.createNewFile();
            FileWriter fw=new FileWriter(newfile);
            BufferedWriter buffw=new BufferedWriter(fw);
            buffw.write("This is the new written text");
            buffw.close();
            System.out.println("success");
        }
    }


    public static void main(String[]args) throws Exception{
//readfile();
        writefile();
}

}
