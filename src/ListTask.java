import java.util.Arrays;

public class ListTask extends Task{

    public ListTask(){}


    public ListTask(String NameDescription, boolean check) {
        super(NameDescription, check);
    }


    //Добавляет задачу от пользователя в его список задач
    public void AddTaskInList(String value, boolean check){
        setNameDescription(value);
        setCheck(check);
    }


    //Удаление из списка задач от пользователя
    public boolean DeleteTask(ListTask[] listTasks, int index){

        return true;
    }


    public void CompletionTack(boolean check){
        setCheck(check);
    }


    public void ShowTask(){
        System.out.println(this.nameDescription);
    }

}
