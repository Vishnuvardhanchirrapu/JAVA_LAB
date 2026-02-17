// File Creation 
import java.io.*;
public class File_01 {
    public static void main(String[] args) throws IOException{
        File f = new File("Ramu.java");
        if(f.exists()){
            System.err.println("Yes, File exist...");
        }
        else{
            f.createNewFile();
            System.out.println("File created : "+f.exists());
        }
    }
}
