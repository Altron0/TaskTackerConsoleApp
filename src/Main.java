import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //отвечает за количество задач, а также за их нее управление
        int couldTask = 0;

        //переменная которая отвечает за выбранную задачу
        int UserPickTask;

        //Создание задач
        ListTask[] listTasks = new ListTask[20];


        for(int i = 0;i < listTasks.length;i++){
            listTasks[i] = new ListTask();
        }


        while(true){
            System.out.println("Add task?");
            System.out.println("1 for Yes, 2 for No");
            int UserInputAdd = scannerInteger();
            switch (UserInputAdd){
                case 1:
                    listTasks[couldTask].AddTaskInList(scannerString(), false);
                    couldTask++;
                    break;
                case 2:
                    break;
            }


            System.out.println("Delete Task?");
            System.out.println("1 for Yes, 2 for No");
            int UserInputDelete = scannerInteger();


            if(UserInputDelete == 1){
                System.out.println("Enter from present task, which is do you need delete a task?");
                for(int i = 0; i < listTasks.length; i++){
                    System.out.println((i + 1) + ". " + listTasks[i].nameDescription);
                }
                UserPickTask = scannerInteger();
                couldTask--;
            }

            
            if(UserInputDelete == 1){

            }
        }
    }


    public static String scannerString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    public static int scannerInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}