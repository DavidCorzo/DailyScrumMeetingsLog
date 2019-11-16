import java.util.Date; // (https://docs.oracle.com/javase/7/docs/api/)
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
import java.text.ParseException;//AÑADIDO PARA EL TRY
import java.time.LocalDate;   //PARA PONER FECHA DE HOY
import java.time.format.*;

public class Task{
    
    /* Do not modify */
    private String msg_reminder, notes;///
    private Date do_date;///
    private int priority = 0;///
    private boolean status = false;
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat;

    Task(String msg_reminder){
        //Turning str date into Date type
        LocalDate today = LocalDate.now(); 
        DateTimeFormatter isodate = DateTimeFormatter.ISO_LOCAL_DATE; //formats todays date
        try{
        simpleDateFormat = new SimpleDateFormat(pattern);
        this.do_date = simpleDateFormat.parse(today.format(isodate));} 
        catch (ParseException e) {
            e.printStackTrace();}
        this.msg_reminder=msg_reminder;
    }
    Task(String msg_reminder,String date, int priority){
        //Turning str date into Date type
        try{
            simpleDateFormat = new SimpleDateFormat(pattern);
            this.do_date=simpleDateFormat.parse(date);}
        catch (ParseException e) {
            e.printStackTrace();
        }
        this.msg_reminder=msg_reminder;
        this.priority=priority;
    }
     /* Your code here */
    Task(String msg_reminder,String date, int priority,String notes){
        //Turning str date into Date type
        try{
            simpleDateFormat = new SimpleDateFormat(pattern);
            this.do_date=simpleDateFormat.parse(date);}
        catch (ParseException e) {
            e.printStackTrace();
        } 
        this.msg_reminder=msg_reminder;
        this.priority=priority;
        this.notes=notes;
    }
   

    public String getNotes(){
        return this.notes;
    }

    public int getPriority(){
        return this.priority;
    }

    public boolean getStatus(){
        return this.status;
    }

    public boolean markAsDone(){
        return this.status = true;
        
    }

    public String getTaskDate() {
        simpleDateFormat = new SimpleDateFormat(pattern);
        String stringdue_date=simpleDateFormat.format(this.do_date);
        return stringdue_date;//Convierte el date a string
    }

    public String toString(){
        return "Task: " + this.msg_reminder + " Priority: " + this.priority + " Due Date: " + getTaskDate()+" Notes: "+this.notes;
    }

    
}