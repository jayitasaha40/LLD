public class Light {
    String color;
    boolean lightOn;

    public Light(String color){
        this.color = color;
        this.lightOn = false;
    }

    public void turnOn(){
        if(!lightOn){
            System.out.println(this.color + " light turned on!");
            this.lightOn = true;
        }
        else{
            System.out.println(this.color + "light is already on");
        }
    }

    public void turnOff(){
        if(lightOn){
            System.out.println(this.color + " light turned off!");
            this.lightOn = false;
        }
        else{
            System.out.println(this.color + "light is already off");
        }
    }
}