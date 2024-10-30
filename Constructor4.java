class Student4
{
int rollno;
String name;
float fee;
Student4(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee; 
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}
class TestThis3{
public static void main(String args[])
{
Student4 s1=new Student4(111,"vaishu",3000f);
Student4 s2=new Student4(222,"kavya",4000f);
s1.display();
s2.display();
}
}