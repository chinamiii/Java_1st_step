package Java11;

public class Sample11_1 {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone("abc@1st-step.com", "090-1234-5678");
        cp.call("090-8765-4321");
        cp.sendMail("xyz@1st-step.com");

        IPhone phone = (IPhone)cp;
        phone.call("090-1111-2222");

        IEmail mail = (IEmail)cp;
        mail.sendMail("kkk@1st-step.com");

    }
}
