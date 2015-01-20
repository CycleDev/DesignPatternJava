package Command;

public class NoCommand implements CommandBase {

    @Override
    public void execute() {
        System.out.println("No Command.");
    }

}
