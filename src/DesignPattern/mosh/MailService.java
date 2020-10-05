package DesignPattern.mosh;

public class MailService {
    public void sendEmail(){
        connect(5);
        authenticate();
        // send email
        disconnect();
    }

   private void connect(int timeout){
        System.out.println("connect");
    }

    private void disconnect(){
        System.out.println("disconnect");
    }

    private void authenticate(){
        System.out.println("authenticate");
    }
}
