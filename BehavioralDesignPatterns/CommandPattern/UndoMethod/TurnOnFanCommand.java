public class TurnOnFanCommand implements ICommand
{
    Fan fan;
    public TurnOnFanCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void exeute() {
        this.fan.turnOn();
    }

    @Override
    public void undo() {
        this.fan.turnOff();
    }
}
