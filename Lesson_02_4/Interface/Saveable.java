package Lesson_02_4.Interface;

import Lesson_02_4.Document.*;

//**Интерфейс с кнопочкой сохранить как */
public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
