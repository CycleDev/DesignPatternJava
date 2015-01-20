package Command;

public class LightOffCommand implements CommandBase {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.lightOff();

    }
}
