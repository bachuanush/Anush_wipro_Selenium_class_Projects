package Day5_Ans;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

class TimeServer {

    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private final List<Client> clients = new ArrayList<>();

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client client : clients) {
            client.updateTime(now);
        }
    }
}

class ConsoleClock implements TimeServer.Client {
    private final String name;

    public ConsoleClock(String name) {
        this.name = name;
    }

    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println(name + " time: " + now);
    }
}

class DigitalClock implements TimeServer.Client {
    private final String location;

    public DigitalClock(String location) {
        this.location = location;
    }

    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("digital clock " + location + ": " + now);
    }
}

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        TimeServer server = new TimeServer();

        server.registerClient(new ConsoleClock("clock-1"));
        server.registerClient(new DigitalClock(""));

        for (int i = 0; i < 3; i++) {
            server.notifyClients();
            Thread.sleep(1000); 
        }
    }
}

