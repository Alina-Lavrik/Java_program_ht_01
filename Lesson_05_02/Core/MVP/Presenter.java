package Lesson_05_02.Core.MVP;

import Lesson_05_02.Core.Models.Contact;
public class Presenter {
    
    private Model model;
    private View view;
    /**В качестве аргумента принимаем конкретную view и путь к нашим данным */
    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }
    /**Загрузка данных */
    public void LoadFromFile() {
        model.load();   // загрузить данные

        if (model.currentBook().count() > 0) { // посмотреть есть ли данные, если да загрузить данные
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.firstName); // передать данные во view
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }
    /**Метод добавления */
    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }
    /**Метод удаления */
    public void remove() {
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }
    /**Метод сохранения данных */
    public void saveToFile() {
        model.save();
    }
    /**Метод переключения к след записи */
    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);                
            }
        }
    }
    /**Метод переключения к предыдущей записи */
    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);  
            }
        }
    }
}
