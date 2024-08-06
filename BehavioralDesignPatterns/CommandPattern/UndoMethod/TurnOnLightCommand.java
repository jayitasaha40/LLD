public class TurnOnLightCommand implements ICommand
{
    Light light;

    public TurnOnLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void exeute() {
        this.light.turnOn();
        
    }

    @Override
    public void undo() {
        this.light.turnOff();
        
    }
}
