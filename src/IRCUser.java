import java.net.Socket;

public class IRCUser {
    private String nick;
    private String username;
    private String name;
    private Socket sock;

    public IRCUser(String nick, String username, String name, Socket sock) {
        this.nick = nick;
        this.username = username;
        this.name = name;
        this.sock = sock;
    }

    public String getNick() {
        return nick;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public Socket getSock() {
        return sock;
    }

    @Override
    public String toString() {
        return "IRCUser{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
