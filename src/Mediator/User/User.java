package Mediator.User;

import Mediator.Server.ServerMediator;

public class User extends AbstractUser {

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
//        user.getSock();
        System.out.println(this.user.getName() + ": Received Message:" + msg);
    }

    @Override
    public String toString() {
        return user.toString();
    }
}
