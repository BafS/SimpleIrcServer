import java.util.ArrayList;
import java.util.List;

/**
 * Server Mediator
 */
public class ServerMediator implements ChatMediatorInterface {
    private List<UserAbstract> userAbstracts;

    public ServerMediator(){
        this.userAbstracts =new ArrayList<>();
    }

    @Override
    public void addUser(UserAbstract userAbstract){
        this.userAbstracts.add(userAbstract);
    }

    @Override
    public void sendMessage(String msg, UserAbstract userAbstract) {
        // Broadcast message
        for (UserAbstract u : this.userAbstracts) {
            //message should not be received by the userAbstract sending it
            if (u != userAbstract) {
                u.receive(msg);
            }
        }
    }
}