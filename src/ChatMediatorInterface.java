/**
 * Created by fabiens on 26/04/16.
 */
public interface ChatMediatorInterface {
    void sendMessage(String msg, UserAbstract userAbstract);

    void addUser(UserAbstract userAbstract);
}