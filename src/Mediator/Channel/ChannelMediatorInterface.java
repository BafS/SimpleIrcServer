package Mediator.Channel;


import Mediator.User.AbstractUser;
import Mediator.Command;

/**
 *
 */
public interface ChannelMediatorInterface {

    public void addUser(AbstractUser au);

    public void removeUser(AbstractUser au);

    public void sendMessage(String msg, AbstractUser userAbstract);

    public void sendCommand(Command cmd, AbstractUser userAbstract);

//    private List<Mediator.User.AbstractUser> userAbstracts;

//    public ChannelMediatorInterface() {
//        this.userAbstracts =new ArrayList<>();
//    }

//    @Override
//    public void addUser(Mediator.User.AbstractUser userAbstract) {
//        this.userAbstracts.add(userAbstract);
//    }
//
//    @Override
//    public void sendMessage(String msg, Mediator.User.AbstractUser userAbstract) {
//        // Broadcast message
//        for (Mediator.User.AbstractUser u : this.userAbstracts) {
//            //message should not be received by the userAbstract sending it
//            if (u != userAbstract) {
//                u.receive(msg);
//            }
//        }
//    }
}