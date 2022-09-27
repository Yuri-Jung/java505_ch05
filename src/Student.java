public class Student extends People {
    public int studentNo;

    public Student(String name, String ssn, int studentNo){
        super(name, ssn);
//        this.name=name;
//        this.ssn=ssn;
        this.studentNo = studentNo;
    }
}


