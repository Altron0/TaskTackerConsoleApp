public class ListTask extends Task{

    public ListTask(){}


    public ListTask(String NameDescription, boolean check) {
        super(NameDescription, check);
    }


    public void AddTaskInList(String value, boolean check){
        setNameDescription(value);
        setCheck(check);
    }


    public void DeleteTask(ListTask[] listTasks, int numberTask){
        for(int i = 0; i < listTasks.length;i++){

        }
    }


    public void CompletionTack(boolean check){
        setCheck(check);
    }


}
