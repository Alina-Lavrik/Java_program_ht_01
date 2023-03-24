package Lesson_05_02.Core.Infrastructure;


import java.util.ArrayList;
import java.util.List;

import Lesson_05_02.Core.Models.Contact;

public class Phonebook {

    private List<Contact> contacts;
    
    /**Записная книжка создается - инициилизация */
    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    /**Создение записи */
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    /**Получение записи */
    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update
    // ???...

    // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        // if ???...
        return contacts;
    }


    public int count() {
        return contacts.size();
    }

}
