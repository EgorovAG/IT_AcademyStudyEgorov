package university;


import java.io.*;
import java.util.List;

public class SaverObjekt {

    public void saveFile(String file, List<Student> ls){
        try (ObjectOutputStream pw = new ObjectOutputStream(new FileOutputStream(file))) {
            pw.writeObject(ls);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




