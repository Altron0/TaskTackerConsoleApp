public class Task {
    public String nameDescription;
    public  boolean IsCheck;


    public String getNameDescription() {
        return nameDescription;
    }


    public void setNameDescription(String nameDescription) {
        this.nameDescription = nameDescription;
    }


    public boolean isCheck() {
        return IsCheck;
    }


    public void setCheck(boolean check) {
        IsCheck = check;
    }


    public Task(){}


    public Task(String NameDescription, boolean check){
        this.nameDescription = NameDescription;
        this.IsCheck = check;
    }
}
