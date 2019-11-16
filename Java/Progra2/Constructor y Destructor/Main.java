import java.util.Scanner; //scanner
import java.io.PrintStream;

class Main{
    public static void main(String[] args) {
        String choice1;
        int choice2=0;
        String name;
        Scanner obj=new 
        Scanner(System.in);
        System.out.println("Create a New List! Introduce the name of the list: ");
        name=obj.nextLine();
        System.out.println("Do you want to add a task? (y/n)");
        choice1=obj.next();
        
        Task firsttask = null;
        if (choice1.equals("y")){
            String msg="";
            String notes = "";
            String date = "";
            int priority = 0;
            while (msg==""){
                System.out.print("Enter the task: ");
                obj.nextLine();
                msg=obj.nextLine();//for some reason it was skipping over the first nextline
                }
                System.out.print("Enter the due date (“yyyy-MM-dd” ): ");
                date=obj.nextLine(); obj.nextLine();
                if (date.isEmpty()){
                    System.out.print("No Date Introduced");
                    date="";
                }
                while (priority<1 || priority>5){
                    System.out.print("\nEnter the priority (1-5):");
                    priority=obj.nextInt();
                    obj.nextLine();
                }
                System.out.println("Notes:");
                notes=obj.nextLine();
                obj.nextLine();
                if (notes.isEmpty()){
                    notes="";
                }
                Task taskobject=new Task(msg,date,priority,notes);
                firsttask=taskobject;
                System.out.print("task successfully added!");
        }
        TaskList tasklist = new TaskList(name, firsttask);
        int quit=0;
        do {
            System.out.println("\n\nMENU\n1. Create a New Task\n2. Print List\n3. Quit");
            if(obj.hasNextInt()){//hasNextInt() returns true only if the next token is a valid int
                choice2=obj.nextInt();
            }
            switch(choice2){
                case 1:
                String msg="";
            String notes = "";
            String date = "";
            int priority = 0;
            while (msg==""){
                System.out.print("Enter the task: ");
                obj.nextLine();
                msg=obj.nextLine();//for some reason it was skipping over the first nextline
                }
                System.out.print("Enter the due date (“yyyy-MM-dd” ): ");
                date=obj.nextLine(); obj.nextLine();
                if (date.isEmpty()){
                    System.out.print("No Date Introduced");
                    date="";
                }
                while (priority<1 || priority>5){
                    System.out.print("\nEnter the priority (1-5):");
                    priority=obj.nextInt();
                    obj.nextLine();
                }
                System.out.println("Notes:");
                notes=obj.nextLine();
                obj.nextLine();
                if (notes.isEmpty()){
                    notes="";
                }
                Task taskobject=new Task(msg,date,priority,notes);
                tasklist.addTask(taskobject);
                System.out.print("task successfully added!");
                break;
                case 2:
                    tasklist.printList();

                break;
                case 3:
                    quit=1;
                break;
               
        }
        
        } while (quit==0);
        
        
        // 


    }
}