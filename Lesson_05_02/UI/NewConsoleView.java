package Lesson_05_02.UI;

/**Новая консоль расширяет класс ConsoleView */
public class NewConsoleView extends ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    /**Переписана чать setDescription */
    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}