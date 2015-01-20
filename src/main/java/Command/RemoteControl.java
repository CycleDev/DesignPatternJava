package Command;

public class RemoteControl {

    CommandBase[] commandsOn;
    CommandBase[] commandsOff;



    public RemoteControl() {

        commandsOn = new CommandBase[7];
        commandsOff = new CommandBase[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i<7; i++){
            commandsOn[i] = noCommand;
            commandsOff[i] = noCommand;
        }

    }

    public void setCommands(int slot, CommandBase commandOn, CommandBase commandOff){
        commandsOn[slot] = commandOn;
        commandsOff[slot] = commandOff;
    }

    public void pressOn(int slot){
        commandsOn[slot].execute();
    }

    public void pressOff(int slot){
        commandsOff[slot].execute();
    }
}
