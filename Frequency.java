import java.util.*;
public class Frequency
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements in array : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter number to find frequency : ");
int k=sc.nextInt();
freq(n,a,k);
}
static void freq(int n,int a[],int k)
{
int f=0;
for(int i=0;i<n;i++)
{
if(a[i]==k)
{
f++;
}
}
System.out.print("Frequency of "+k+" is : "+f);
}
}

output:

Enter size of array : 
6
Enter elements in array : 
1 2 5 2 9 2
Enter number to find frequency : 
2
Frequency of 2 is : 3