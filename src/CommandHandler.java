import Mediator.Command;
import Mediator.User.IRCUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Handle user input
 */
public class CommandHandler {

    private Command lex(String command) {
        String[] tokens = command.split(" ");
        return new Command(tokens[0], tokens);
    }

//    private void parse(Command cmd) {
//        switch (cmd.getType()) {
//            case "NICK":
//                return
//        }
//    }

    public IRCUser handShake(Socket sock) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

        // TODO: Factory to get the right command type
        Command c;
        do {
            c = lex(in.readLine());
        } while (!c.getType().equals("NICK"));
//        System.out.println(c.getArgs()[1]);

        do {
            c = lex(in.readLine());
        } while (!c.getType().equals("USER"));
//        System.out.println(c.getArgs()[1]);

        return new IRCUser(c.getArgs()[1], c.getArgs()[1], c.getArgs()[2], sock);
    }

//    public void join(IRCUser user) {
//    }
}
