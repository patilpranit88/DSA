public class oop {
    public static void main(String[] args) {
        // Pen P = new Pen();
        // P.setcolor("Blue");
        // System.out.println(P.getcolor());
        // P.settip(5);
        // System.out.println(P.gettip());
        // Bankaccount b = new Bankaccount();
        // b.username= "Pranit";
        // b.setpass(123);

        Student s1 = new Student("Pranit");
        s1.name="Pranit";
        s1.roll = 12;
        s1.pass = "122";
        s1.mark[0]=90;
        s1.mark[1]=95;
        s1.mark[2]=100;

        Student s2 = new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s1.mark[i]);
        }
        

      
    }
}

class Pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String  newcolor){
        this.color=newcolor;
    }
    void settip(int tip){
        this.tip=tip;
    }
}

class Student{
    String name;
    int roll;
    String pass;
    int mark[];

    Student(Student s1){
        mark = new int[3];
        this.name = s1.name;
        this.roll =s1.roll;
        this.mark = s1.mark;
    }

    Student(String name){

        this.name = name;
    }
}

class Bankaccount{
    public String username;
    private int password;

    public void setpass(int newp){
        password= newp;
    }
}
