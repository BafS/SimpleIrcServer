package Mediator.Channel;

import Mediator.User.AbstractUser;
import Mediator.Command;

import java.util.ArrayList;

public class ChannelMediator implements ChannelMediatorInterface {

    private ArrayList<AbstractUser> users;
    private IRCChannel channel;

    public ChannelMediator(IRCChannel chan) {
        channel = chan;
        users = new ArrayList<>();
    }

    @Override
    public void addUser(AbstractUser au) {
        users.add(au);
    }

    @Override
    public void removeUser(AbstractUser au) {
        users.remove(au);
    }

    @Override
    // Send a message to all users in the channel
    public void sendMessage(String msg, AbstractUser au2) {
        users.stream().filter(au -> au != au2).forEach(au -> {
            au.receive(msg);
        });
    }

    @Override
    public void sendCommand(Command cmd, AbstractUser userAbstract) {

    }
}
