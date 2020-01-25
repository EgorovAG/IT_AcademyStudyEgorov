package task2_3;

import task2_3.api.IRegex;
import task2_3.api.IStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task implements IRegex, IStrings {
private String word;
private File file;


    public Task(String word, File file) {
        this.word = word;
        this.file = file;
    }

    @Override
    public void counterReg() throws FileNotFoundException {
        String regexWord1 = "\\b"+word+"\\b";
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile(regexWord1);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                count++;
            }
        }
        System.out.println(String.format("количество слов \"%s\" %d  ", word, count));
    }

    @Override
    public void counterString() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] line1= line.split(" ");
            for (String temp : line1) {
                if (temp.matches("\\W?"+"\\b"+word+"\\b"+"\\W?"+"\\W?"+"\\W?"))
                    count++;
                }

            }

        System.out.println(String.format("количество слов \"%s\" %d  ",word , count));
    }
}
