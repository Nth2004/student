class student{
    String name;
    int rollno;
    
    public student (String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String getname(){
        return name;
    }
    public int getrollno(){
        return rollno;
    }
    public void display(){
        System.out.println("A division");

    }
}
class student2 extends student{
public student2(String name,int rollno){
    super(name, rollno);
}
public void display(){
    System.out.println("Bdivision");
}
    }
class student3 extends student{
    public student3(String name,int rollno){
            super(name, rollno);
        }
        public void display(){
            System.out.println("c division");
        }
    }
class Oop{
    public static void main(String[] args) {
        student2 s=new student2("neha",20);
        student3 se=new student3("gandhali",29);
        System.out.println(s.getname());
        System.out.println(s.getrollno());
        s.display();
        System.out.println(se.getname());
        System.out.println(se.getrollno());
        se.display();

    }
}

