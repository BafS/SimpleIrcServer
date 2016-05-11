package Mediator.Server;

import Mediator.Channel.AbstractChannel;
import Mediator.User.AbstractUser;

/**
 * Created by fabiens on 26/04/16.
 */
public interface ServerMediatorInterface {
    void sendMessage(String msg, AbstractUser abstractUser);

    void addUser(AbstractUser abstractUser);

    void addChannel(AbstractChannel channel);
}