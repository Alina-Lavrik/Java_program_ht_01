package Lesson_05;

public class SumModel extends CalcModel {
    /**Описываем метод который позволяет: */
    public SumModel() {
    }
    /**Получить результат */
    @Override
    public int result() {
        return x + y;
    }
    /**Задать значение x */
    @Override
    public void setX(int value) {
        super.x = value;
    }

    /**Задать значение y */
    @Override
    public void setY(int value) {
        super.y = value;
    }


}

