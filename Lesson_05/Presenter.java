package Lesson_05;


public class Presenter {
    View view;
    Model model;

    /**В качестве конструктора передаем 2 компоненты */
    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }
    /**Пользовательская кнопочка */
    public void buttonClick(){
        int a = view.getValue("a: ");  // обращение идет ко view и печатается текст
        int b = view.getValue("b: ");
        model.setX(a);  // связываем данные, которые пришли из view c теми данными кот нужно положить в нашу модель
        model.setY(b);
        int result = model.result();   // у модели есть кнопка получить результат и кладется в переменную
        view.print(result, "Sum: ");  // данные из модели переходят во view
    }
}


