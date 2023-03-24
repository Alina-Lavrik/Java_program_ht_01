package Lesson_02_4;

import Lesson_02_4.Format.*;
import Lesson_02_4.Applications.*;;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad(); // создать записную книжку
        notes.newFile();               // добавить новый файл
        notes.currentDocument().addAllText("text1"); // добавить нужный текст в документ
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt()); // сохранить -> куда сохранить и что является форматом
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
}


