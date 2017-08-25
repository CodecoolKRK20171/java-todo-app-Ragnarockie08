/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */

import java.util.ArrayList;


public class TodoList{

    ArrayList<TodoItem> todoItems = new ArrayList<>();

    public void addItem(TodoItem item){

        if (TodoItem.class.isInstance(item)){
            todoItems.add(item);
        }else {
            System.out.println("Wrong data");
        }
    }

    public void printList( ){

        String list = "";
        for (int i = 0; i < todoItems.size(); i++){
            list += (i + 1) + ". " + todoItems.get(i).itemString() + "\n";
        }
        System.out.println(list);
    }
}
