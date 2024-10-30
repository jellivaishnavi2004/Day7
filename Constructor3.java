class Student3
{
int id;
String name;
Student3(int i,String n){
id=i;
name=n; 
}
Student3(){}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student3 s1=new Student3(111,"vaishu");
Student3 s2=new Student3();
s2.id=s1.id;
s2.name=s2.name;
s1.display();
s2.display();
}
}