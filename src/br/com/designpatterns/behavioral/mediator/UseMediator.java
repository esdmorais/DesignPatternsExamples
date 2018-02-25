package br.com.designpatterns.behavioral.mediator;

public class UseMediator {

    public static void main(String[] args) {
        VirtualChatRoom chatRoom = new VirtualChatRoom();

        Person phoebe = new FemalePerson("Phoebe");
        Person joey = new MalePerson("Joey");
        Person rachel = new FemalePerson("Rachel");

        chatRoom.join(phoebe);
        chatRoom.join(joey);
        chatRoom.join(rachel);

        phoebe.sendMessage(joey, "hi, Joey!");
        joey.sendMessage(phoebe, "hi, how you doing?");
        joey.sendMessage(rachel, "hey Rach, let's have lunch together.");
        rachel.sendMessage(joey, "all right! I'm on my way.");
        rachel.sendMessage(phoebe, "Pheebs, I'm going to have lunch with Joey. join us!");
        phoebe.sendMessage(rachel, "okay Rach, I'm going!");
    }
}
