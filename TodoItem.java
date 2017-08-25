/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{

    String mark;
    String name;

    public TodoItem(String name){

        this.mark = " ";
        this.name = name;
    }

    public void setMark( ){

        if (mark.equals(" ")){
            mark = "X";
        } else{
            mark = " ";
        }
    }

    public String itemString(){
        
        String item = "[" + mark + "] " + name;

        return item;
    }
}
