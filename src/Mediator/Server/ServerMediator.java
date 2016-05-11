package Mediator.Server;

import Mediator.Channel.AbstractChannel;
import Mediator.User.AbstractUser;
import java.util.ArrayList;
import java.util.List;

/**
 * Mediator.Server Mediator
 */
public class ServerMediator implements ServerMediatorInterface {
    private List<AbstractUser> users;
    private List<AbstractChannel> channels;

    public ServerMediator(){
        users = new ArrayList<>();
    }

    @Override
    public void addUser(AbstractUser abstractUser){
        users.add(abstractUser);
    }

    @Override
    public void addChannel(AbstractChannel channel) {
        channels.add(channel);
    }

    // TODO listen here ?
    public void listen() {
//        CommandHandler ch = new CommandHandler();

        users.stream().forEach(u -> {
//            u.getIRCUser().getSock();
        });
    }

    @Override
    // Send a message to all users in the server
    public void sendMessage(String msg, AbstractUser abstractUser) {
        // Broadcast message
        //message should not be received by the abstractUser sending it
        users.stream().filter(u -> u != abstractUser).forEach(u -> {
            u.receive(msg);
        });
    }
}