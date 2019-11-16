import java.util.LinkedList; // (https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)
import java.util.Collections; // (https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html)
import java.util.Comparator; // (https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

public class TaskList{
    
    /* Do not modify */
    private String name;
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /* Your code here */
    TaskList(String name, Task task) {
        this.name=name;
        this.tasks=new LinkedList<Task>();
        if (task!=null){
            addTask(task);
        }

    }

    public boolean addTask(Task task){
        return this.tasks.add(task);
    }

    public void sortByPriority(){
        Collections.sort(this.tasks, Comparator.comparingInt((Task task) -> task.getPriority()).reversed());
    }

    public void printList(){
       System.out.println("NOMBRE DE LA LISTA: "+this.name);
       if (this.tasks.size()==0){
        System.out.println("No tasks added yet\n\n");
       }
       sortByPriority();
       int range=this.tasks.size();
       for (int i=0;i<range;i++){
        System.out.println(this.tasks.get(i));
        // System.out.println((this.tasks.get(i)).toString());
       }

    }

}