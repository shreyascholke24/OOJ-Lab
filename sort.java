import java.lang.*;
class sort
{
public static void main(String args[ ])
{
int array[ ]={02,99,0,56,-8};
int i=0,j=0,temp=0,key;
System.out.println(" the array elements are:");
for( i=0;i<5;i++)
{
for( j=i+1;j<5;j++)
{
if(array[i]>array[j])
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
for( i=0;i<5;i++)
{
System.out.println(array[i]);
}
if(key=array[i])
System.out.println("found successful");
else
System.out.println(" not found unsuccessful");
}
}