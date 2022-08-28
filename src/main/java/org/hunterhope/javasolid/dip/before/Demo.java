package org.hunterhope.javasolid.dip.before;

class Email {

    public String message() {
        return "email...";
    }
}

class Line {

    public String message() {
        return "line...";
    }
}
class SMS{//簡訊功能
    public String message() {
        return "sms...";
    }
}
class IPhone {//實體,不可再變動

    public void read(Email email) {
        System.out.println(email.message());
    }

    public void read(Line line) {
        System.out.println(line.message());
    }
    //強迫加入
     public void read(SMS sms) {
        System.out.println(sms.message());
    }
}

public class Demo {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.read(new Email());
        iPhone.read(new Line());
        iPhone.read(new SMS());
    }

}
