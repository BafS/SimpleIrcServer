import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class IRCServer {

    public static void main(String[] args) {
        ServerMediator mediator = new ServerMediator();

        ServerHandler sh = new ServerHandler();

        new Thread(() -> {
//            int portNumber = Integer.parseInt(args[0]);

            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(6666);

                while (true) {
                    Socket clientSocket = serverSocket.accept();

                    IRCUser user = sh.handShake(clientSocket);

                    UserAbstract userAbs = new User(mediator, user);
                    mediator.addUser(userAbs);

                    System.out.println("User added");
                    System.out.println(userAbs);
                    System.out.println("---");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();

//        UserAbstract userAbstract2 = new User(mediator, "Lisa");
//        UserAbstract userAbstract3 = new User(mediator, "Saurabh");
//        UserAbstract userAbstract4 = new User(mediator, "David");

//        mediator.addUser(userAbstract2);
//        mediator.addUser(userAbstract3);
//        mediator.addUser(userAbstract4);

//        userAbstract1.sendMousePosition(20, 10);
    }
}