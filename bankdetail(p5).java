import java.util.Scanner;
import java.lang.Math;
class bank
{
String name;
int acc_no;
float bal,si;

void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println();
System.out.println("Enter the name of Account holder:");
name=sc.nextLine();
System.out.println("Enter the account number:");
acc_no=sc.nextInt();
System.out.println("Enter account balance:");
bal=sc.nextFloat();
}
void display()
{
System.out.println();
System.out.println("Details:");
System.out.println("Name:"+ name +"\nAccount number:"+ acc_no +"\nBalance"+ bal);
}

void deposits()
{
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("\nDo you want to deposit(1 for Yes,2 for No):");
int d=sc.nextInt();
if(d==1)
{
System.out.println("Enter the amount to be deposited:");
int amt=sc.nextInt();
bal=bal+amt;
System.out.println("Available balance:"+bal);
}
}
}

class current extends bank
{
float service_charge=100;
void cheque()
{
System.out.println("\nCheque service available");
}
void withdrawal()
{
float amount;
Scanner sc=new Scanner(System.in);
System.out.println("Minimum balance=Rs 1000.00");
System.out.println("Enter the amount to be withdrawn:");
amount=sc.nextFloat();
if(amount>bal)
System.out.println("Balance is insufficient");
else
{
bal=bal-amount;
if(bal<1000)
{
bal=bal-service_charge;
System.out.println("Service charge of Rs:"+ service_charge+"is added");
System.out.println("Available balance="+bal);
}
else
{
System.out.println(amount+"Withdrawn");
System.out.println("Available balance="+bal);
}
}
}
}

class savings extends banks
{
void cheque()
{
System.out.println("\n No cheque services");
}
void simple_interest()
{
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("\nRate of interest:");
int r=sc.nextInt();
System.out.println("Enter the number of times interest applied per time period:");
int n=sc.nextInt();
System.out.println("Enter the time elapse:");
int t=sc.nextInt();
si=bal*(1+(r/n));
System.out.println("Simple interest=Rs"+(Math.pow(si,(n*t))));
}
void withdrawal()
{
float amount;
Scanner sc=new Scanner(System.in);
System.out.println("No minimum balance required:");
System.out.println("Enter the amount to be withdrawn:");
amount=sc.nextFloat();
if(amount>bal)
System.out.println("Balance insufficient");
else
{
bal=bal-amount;
System.out.println(amount +"withdrawn");
System.out.println("Available balance:"+ bal);
}
}
}