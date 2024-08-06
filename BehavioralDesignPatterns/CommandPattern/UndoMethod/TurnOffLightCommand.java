public class TurnOffLightCommand implements ICommand 
{
    Light light;

    public TurnOffLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void exeute() {
        this.light.turnOff();
        
    }

    @Override
    public void undo() {
        this.light.turnOn();
        
    }
}
