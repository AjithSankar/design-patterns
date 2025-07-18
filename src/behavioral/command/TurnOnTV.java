package behavioral.command;

public class TurnOnTV implements Command {

    private TV tv;

    public TurnOnTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
