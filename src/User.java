public class User extends UserAbstract {

    public User(ServerMediator mediator, IRCUser user) {
        super(mediator, user);
    }

    @Override
    public void send(String msg) {
//        mediator.sendMessage();
//        super(msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.user.getName() + ": Received Message:" + msg);
    }

    @Override
    public String toString() {
        return user.toString();
    }
}
