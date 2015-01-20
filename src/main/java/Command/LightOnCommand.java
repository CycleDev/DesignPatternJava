package Command;

public class LightOnCommand implements CommandBase {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.lightOn();

    }
}
