package Saver;

import Saver.api.ISaverChatInFile;
import chat.Chat;

import java.io.FileOutputStream;

public class FileSaver implements ISaverChatInFile {
    private String fileName;
    private FileOutputStream stream;




    public  FileSaver(){
        this("default_name.txt");
    }

    public FileSaver(String fileName) {
        this.fileName = fileName;
    }

    public FileSaver(FileOutputStream stream){
        this.stream = stream;
    }


    @Override
    public void saveFileChat(Chat chat) {

    }
}
