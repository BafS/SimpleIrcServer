import Mediator.Channel.ChannelMediator;
import Mediator.Server.ServerHandler;
import Mediator.Server.ServerMediator;
import Mediator.User.AbstractUser;
import Mediator.User.IRCUser;
import Mediator.User.User;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IRCServer {

    public static void main(String[] args) {
        ServerMediator servMediator = new ServerMediator();
//        ChannelMediator chanMediator = new ChannelMediator();

        ServerHandler sh = new ServerHandler();

        new Thread(() -> {
//            int portNumber = Integer.parseInt(args[0]);

            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(6666);

                while (true) {
                    Socket clientSocket = serverSocket.accept();

                    IRCUser user = sh.handShake(clientSocket);

                    AbstractUser userAbs = new User(servMediator, user);
                    servMediator.addUser(userAbs);
//                    chanMediator.addUser(userAbs);

                    System.out.println("Mediator.User.User added");
                    System.out.println(userAbs);
                    System.out.println("---");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
    }
}