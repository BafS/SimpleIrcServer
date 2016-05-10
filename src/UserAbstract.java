public abstract class UserAbstract {
    protected ChatMediatorInterface mediator;
    protected IRCUser user;

    public UserAbstract(ChatMediatorInterface mediator, IRCUser user) {
        this.mediator = mediator;
        this.user = user;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}