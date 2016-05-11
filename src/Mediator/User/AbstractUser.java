package Mediator.User;

import Mediator.Server.ServerMediatorInterface;

public abstract class AbstractUser {
    protected ServerMediatorInterface mediator;
    protected IRCUser user;

    public AbstractUser(ServerMediatorInterface mediator, IRCUser user) {
        this.mediator = mediator;
        this.user = user;
    }

    public abstract void send(String msg);

//    public abstract void send(Command cmd);

    public abstract void receive(String msg);
}