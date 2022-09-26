package lecture2.check3;


class Person{
    private Role r;

    void setRole(Role r){
        this.r = r;
    }

    Role getRole(){
        return r;
    }

    void doIt(){
        r.doIt();
    }
}

abstract class Role{
    abstract void doIt();
}

class Driver extends Role{
     void doIt(){
        System.out.println("drive");
    }
}

class Worker extends Role{
    void doIt(){
        System.out.println("work");
    }
}

public class Main {
    public static void main(String args[]) {
        Person p1 = new Person();
        p1.setRole(new Driver());
        p1.doIt();
        p1.setRole(new Worker());
        p1.doIt();
    }
}
