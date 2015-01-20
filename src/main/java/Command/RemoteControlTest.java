package Command;


public class RemoteControlTest {

    public static void test(){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommands(0, lightOnCommand, lightOffCommand);

        remoteControl.pressOn(2);
        remoteControl.pressOff(0);
        remoteControl.pressOn(0);
    }
}
