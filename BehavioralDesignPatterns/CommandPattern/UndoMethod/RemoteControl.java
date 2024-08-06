import java.util.Stack;

public class RemoteControl 
{
    ICommand command;
    Stack<ICommand> history = new Stack<>();

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void execute(){
        history.add(command);
        command.exeute();
    }

    public void undo(){
        if(!history.empty()){
            history.pop().undo();
        }
        else{
            System.err.println("Nothing to undo");
        }
    }


}
