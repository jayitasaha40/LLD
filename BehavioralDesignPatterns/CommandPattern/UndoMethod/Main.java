public class Main {
    public static void main(String[] args){

        Light light1 = new Light("Red"); //Light1
        Light light2 = new Light("Blue"); //Light2
        Fan fan1 = new Fan("BedRoom"); //Fan1
        Fan fan2 = new Fan("LivingRoom"); //Fan2

        //RemoteControl
        RemoteControl remoteControl = new RemoteControl();

        //TurnOnLightCommand(Light2)
        ICommand turnOnLight2 = new TurnOnLightCommand(light2);
        remoteControl.setCommand(turnOnLight2);
        remoteControl.execute();

        //TurnOnFanCommand(Fan1)
        ICommand turnOnFan1 = new TurnOnFanCommand(fan1);
        remoteControl.setCommand(turnOnFan1);
        remoteControl.execute();

        //TurnOnFanCommand(Fan2)
        ICommand turnOnFan2 = new TurnOnFanCommand(fan2);
        remoteControl.setCommand(turnOnFan2);
        remoteControl.execute();

        //Undo
        remoteControl.undo();
        remoteControl.undo();
        System.out.println("----------------------------------------");
        //Turn on Light1
        ICommand turnOnLight1 = new TurnOnLightCommand(light1);
        remoteControl.setCommand(turnOnLight1);
        remoteControl.execute();

        //Turn Off Light2
        ICommand turnOffLight2 = new TurnOffLightCommand(light2);
        remoteControl.setCommand(turnOffLight2);
        remoteControl.execute();

        System.out.println("--------------UNDO--------------------------");
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}
