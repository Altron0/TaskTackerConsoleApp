public class Task {
    public String nameDescription;
    public  boolean IsCheck;


    //Получение данных
    public String getNameDescription() {
        return nameDescription;
    }


    //Присвание переменной задачу, которую пользователь описал
    public void setNameDescription(String nameDescription) {
        this.nameDescription = nameDescription;
    }


    public boolean isCheck() {
        return IsCheck;
    }


    //Этот метод не используеться в дальшем будет использоваться
    public void setCheck(boolean check) {
        IsCheck = check;
    }


    public Task(){}


    public Task(String NameDescription, boolean check){
        this.nameDescription = NameDescription;
        this.IsCheck = check;
    }
}
