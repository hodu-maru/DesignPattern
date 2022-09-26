package lecture1.page28.check6;

public class Student {
    private Professor professor;
    private String advisor;

    public void setAdvisor(Professor professor){
        this.advisor = advisor;
    }

    public void advise(String msg){
        System.out.println(msg);
    }
}
