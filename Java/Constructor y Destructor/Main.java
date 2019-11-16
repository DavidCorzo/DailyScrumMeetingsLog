import java.util.Scanner; //scanner
import java.util.function.ToIntFunction;
import java.io.PrintStream;
import java.text.ParseException;

class Main{
    public static void main(String[] args) {
        String choice1;
        int choice2=0;
        String name;
        Scanner obj=new 
        Scanner(System.in);
        System.out.println("Create a New List! Introduce the name of the list: ");
        name=obj.nextLine();
        TaskList tasklist = new TaskList(name);
        System.out.println("Do you want to add a task? (y/n)");
        choice1=obj.next();
        if (choice1.equals("y")){
            String msg="";
                while (msg==""){
                System.out.print("Enter the task: ");
                obj.nextLine();
                msg=obj.nextLine();//for some reason it was skipping over the first nextline
                }
                Task taskobject=new Task(msg);
                System.out.print("\nEnter the priority (1-5):");
                String priority=obj.nextLine();  
                if (priority.isEmpty()==false){
                    int introducedPriority=Integer.parseInt(priority);
                    System.out.print("Enter the due date (“yyyy-MM-dd” ): ");
                    String date=obj.nextLine();
                    taskobject=new Task(msg,date,introducedPriority);
                    System.out.println("Notes:");
                    String notes=obj.nextLine();
                    obj.nextLine();
                    if (notes.isEmpty()==false){
                    taskobject=new Task(msg,date,introducedPriority,notes);
                    }
                }
                tasklist = new TaskList(name,taskobject);
                System.out.print("task successfully added!");
                }
        
        int quit=0;
        do {
            System.out.println("\n\nMENU\n1. Create a New Task\n2. Print List\n3. Quit");
            if(obj.hasNextInt()){//hasNextInt() returns true only if the next token is a valid int
                choice2=obj.nextInt();
            }
            switch(choice2){
                case 1:
                String msg="";
                while (msg==""){
                System.out.print("Enter the task: ");
                obj.nextLine();
                msg=obj.nextLine();//for some reason it was skipping over the first nextline
                }
                Task taskobject=new Task(msg);
                System.out.print("\nEnter the priority (1-5):");
                String priority=obj.nextLine();  
                if (priority.isEmpty()==false){
                    int introducedPriority=Integer.parseInt(priority);
                    System.out.print("Enter the due date (“yyyy-MM-dd” ): ");
                    String date=obj.nextLine();
                    taskobject=new Task(msg,date,introducedPriority);
                    System.out.println("Notes:");
                    String notes=obj.nextLine();
                    obj.nextLine();
                    if (notes.isEmpty()==false){
                    taskobject=new Task(msg,date,introducedPriority,notes);
                    }
                }
                tasklist.addTask(taskobject);
                System.out.print("task successfully added!");
                break;
                case 2:
                    tasklist.printList();

                break;
                case 3:
                    quit=1;
                break;}
            }while (quit==0);
    }}
        
        
      // 


    

