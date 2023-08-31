package ru.netology;

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {    //Мы воспользуемся методом contains, который есть у каждого объекта типа String: s1.contains(s2) отвечает на вопрос, содержится ли текст из s2 в тексте из s1
            return true;
        }
        return false;
    }
}