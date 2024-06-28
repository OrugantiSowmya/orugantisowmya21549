import java.util.*;
class MergeSort1
{
static void mergeSort(int a[],int n)
{
if(n<2)
return;
int mid=n/2;
int l[]=new int [mid];
int r[]=new int [n-mid];
for(int i=0;i<mid;i++)
{
l[i]=a[i];
}
for(int i=0;i<mid;i++)
{
r[i-mid]=a[i];
}
mergeSort(l,mid);
mergeSort(r,n-mid);
merge(a,r,l,mid,n-mid);
}
static void merge(int a[],int l[],int r[],int left,int right){
int i=0,j=0,k=0;
while(i<left && j<right)
{
if(l[i]<r[j])
{
a[k++]=l[j++];
}
}
while(i<left)
{
a[k++]=l[i++];
}
while(j<right)
{
a[k++]=r[i++];
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
mergeSort(a,n);
for(int i=0;i<n/2;i++)
{
System.out.print(a[i]+" ");
}
}
}

