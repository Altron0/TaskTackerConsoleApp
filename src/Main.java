import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //отвечает за количество задач, а также за их нее управление
        int couldTask = 0;

        //переменная которая отвечает за выбранную задачу
        int UserPickTask = 0;

        //Создание задач
        ListTask[] listTasks = new ListTask[20];

        //Отвечает за выход из приложения
        int ExitApplication = 0;

        for (int i = 0; i < listTasks.length; i++) {
            listTasks[i] = new ListTask();
        }

        //Работа приложения
        while (true) {
            //проверка, есть ли у пользователя задачи
            if (couldTask == 0) System.out.println("You have not the task");
            else{
            System.out.println("The list is your the task");
            for(int i = 0; i < couldTask;i++){
                listTasks[i].ShowTask();
            }

            }

            //Запрашивает у пользователя, хочет ли он добавить новую задачу в списко
            System.out.println("Add task?");
            System.out.println("1 for Yes, 2 for No");
            int UserInputAdd = scannerInteger();

            //Дальше если пользователь выбрал "Yes", то ему предлагаеться ввести задачу
            switch (UserInputAdd) {
                case 1:
                    System.out.println("Enter, Do you want to what's add?");
                    String InputTask = scannerString();
                    listTasks[couldTask].AddTaskInList(InputTask, false);
                    couldTask++;
                    break;
                case 2:
                    break;
            }


            //Запрашивает у пользователя, хочет ли он удалить задачу
            // из своего списка если они ранее были добавлены
            System.out.println("Delete Task?");
            System.out.println("1 for Yes, 2 for No");
            int UserInputDelete = scannerInteger();

            //Если пользователь ввел "Yes", то ему выводиться список его задач которые он может удалить
            if (UserInputDelete == 1) {
                System.out.println("Enter from present task, which is do you need delete a task?");
                for (int i = 0; i < listTasks.length; i++) {
                    System.out.println(i + ". " + listTasks[i].nameDescription);
                }
                UserPickTask = scannerInteger();
                couldTask--;
            }

            //Идет проверка еще одна, которая удаляет задачу из списка
            if (UserInputDelete == 1) {
                listTasks[UserInputAdd].DeleteTask(listTasks, UserPickTask);
            }

            //Выход из приложения
            System.out.println("Do you want to exit with the application?");
            System.out.println("1 for yes, 2 for not");
            ExitApplication = scannerInteger();

            //Проверка на введеное позьзователем условие, "Yes" для выхода или "No" для продолжения
            switch (ExitApplication){

                case 1:
                    return;

                case 2:
                    continue;
            }
        }
    }


    //Обработка и возвращение введенного данных типа boolean
    public static boolean scannerBoolean(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }


    //Обработка и возвращение введенного данных типа String
    public static String scannerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    //Обработка и возвращение введенного данных типа Integer
    public static int scannerInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}