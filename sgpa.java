import java.util.*;
class Student
{
string usn,name;
int credits[]=new int[20];
int marks[]=new int[20];
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the USN of the student");
usn=sc.nextLine();
System.out.println("Enter the name of the student");
name=sc.nextLine();
System.out.println("Enter the number of subjects");
n=sc.nextInt();
System.out.println("Enter the details of the subject:");
System.out.println("Enter the Credits");
for(i=0;i<20;i++)
credits[i]=sc.nextInt();
System.out.println("Enter the marks of the student");
for(i=0;i<20;i++)
marks[i]=sc.nextInt();
}
int sgpa()
{
int a=new int[20];
int gp;
switch(r)
{
case 10:
case 9:
gp[i]=10;
break;
case 8:
gp[i]=9;
break;
case 7:
gp[i]=8;
break;
case 6:
gp[i]=7;
break;
case 5:
gp[i]=6;
break;
case 4:
gp[i]=5;
break;
case 3:
case 2:
case 1:
case 0:
System.out.println("The student is failed");
break;
}
}
for(i=0;i<20;i++)
{
sgpa=(gp[i]*credits[i])/sum;
}
System.out.println("The sgpa is"+" "+sgpa);
}