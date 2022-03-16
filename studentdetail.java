import java.util.*

class student{
           string name;
           string usn;
         int marks[]=new int[3];
student (string usn,string name,int marks[]){
         this.usn=usn;
         this.name=name;
         this.marks=marks;
}
void display(){
         system.out.println("name="+student.name);
         system.out.println("usn="+student.usn);
         system.out.println("percentage="+student.result());
}
float result(){  
int total =student.marks[0]+student.marks[1]+student.marks[2];
return total/300;
}
}
public class studetails {
public static void main(string args[]){
string name,usn;
int marks[]=new int[3];
scanner sc=new scanner(system.in)
system.out.println("enter student details:"); 
system.out.println("name: ");
name =sc.nextline();
syste.out.println("usn: ");
usn = sc.nextline();
for(int i=0;i<3;i++){
system.out.println("marks in subject"+(1+1)+" ;");
marks[1]=sc.nextint();
}
student mystu=new student(usn,name,marks);
system.out.println("student deatails:\n");
mystu.display(mystu);
}