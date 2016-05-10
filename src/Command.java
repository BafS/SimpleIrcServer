public class Command {
    private String type;
    private String[] args;

    public Command(String type, String[] args) {
        this.type = type.toUpperCase();
        this.args = args;
    }

    public String getType() {
        return type;
    }

    public String[] getArgs() {
        return args;
    }
}
