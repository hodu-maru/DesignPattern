package lecture1.page28.check6;

public class Main {
    public static void main(String args[]){
        Professor hongGilDong = new Professor();
        Student manSup = new Student();

        hongGilDong.setStudent(manSup);
        hongGilDong.advise();
    }
}
