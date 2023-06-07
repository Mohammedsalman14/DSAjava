package oops;

public class Main {
    public static void main(String[] args) {
        student s1 = new student();

        // student s2 = new student(21,"mohammedsalman",2122.3f);
        // System.out.println(s2.getname());

        student s3=new student(s1);
        System.out.println(s3.getname());
        // s1.name = "salmanmd";
        // s1.rno = 123;
        System.out.println(s1.rno + " " + s1.name + " " + s1.marks);
        System.out.println(s1.getname());
    }
}

class student {
    int rno;
    String name;
    float marks = 12.2f;

    student() {
        this.rno = 1;
        this.name = "mdsalman";
        this.marks = 121.2f;

    }
    student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    student(student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }
    public String getname(){
        return this.name;
    }

    public void setname(String value){
        this.name=value;
    }
    
}
