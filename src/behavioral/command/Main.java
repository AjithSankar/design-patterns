package behavioral.command;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();
        TV tv = new TV();

        remoteControl.setCommand(new TurnOnTV(tv));
        remoteControl.press();

        remoteControl.setCommand(new TurnOffTV(tv));
        remoteControl.press();

    }
}
