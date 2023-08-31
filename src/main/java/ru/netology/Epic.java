package ru.netology;

public class Epic extends Task {

    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String item : subtasks) {
            if (item.contains(query)) {    //Мы воспользуемся методом contains, который есть у каждого объекта типа String: s1.contains(s2) отвечает на вопрос, содержится ли текст из s2 в тексте из s1
                return true;
            }
        }
        return false;
    }

}
