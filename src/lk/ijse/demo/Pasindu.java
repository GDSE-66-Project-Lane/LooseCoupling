package lk.ijse.demo;

public class Pasindu {
    public void likeToChatWithSaduni() {
        //Tight Coupling
//        Saduni saduni = new Saduni();
//        saduni.chatting();

        //Loose Coupling
        Wedding wedding = new Saduni();
        wedding.chatting();
    }

    public  void dance(){
        Wedding wedding = new Saduni();
        wedding.chatting();
    }
}
