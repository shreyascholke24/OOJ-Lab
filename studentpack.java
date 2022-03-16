package CIE;
import java.util.Scanner;
public class Student{
     Scanner scan=new Scanner(System.in);
     public String usn, name;
     public int sem;

     public void accept(){
           System.out.println("Enter USN:");
           usn = scan.nextline();
           System.out.println("Enter Name:");
           name = scan.nextline();
           System.out.println("Enter Sem:");
           sem = scan.nextline();
    }

    public void display(){
           System.out.println("Name:"+name);
           System.out.println("USN:"+usn);
           System.out.println("Sem"+sem);
    }