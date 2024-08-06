public class Fan {
    String name;
    boolean fanOn;

    public Fan(String name){
        this.name = name;
        this.fanOn = false;
    }

    public void turnOn(){
        if(!fanOn){
            System.out.println(this.name + " fan turned on!");
            this.fanOn = true;
        }
        else{
            System.out.println(this.name + "fan is already on");
        }
    }

    public void turnOff(){
        if(fanOn){
            System.out.println(this.name + " fan turned off!");
            this.fanOn = false;
        }
        else{
            System.out.println(this.name + "fan is already off");
        }
    }
    
}
