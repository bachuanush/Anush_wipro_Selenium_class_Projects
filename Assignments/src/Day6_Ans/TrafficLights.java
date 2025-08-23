package Day6_Ans;

interface State {
    State next();
}

enum TrafficLight implements State {
    RED {
        @Override
        public State next() {
            return GREEN;
        }
    },
    GREEN {
        @Override
        public State next() {
            return YELLOW;
        }
    },
    YELLOW {
        @Override
        public State next() {
            return RED;
        }
    };

    @Override
    public String toString() {
        return name();
    }
}
public class TrafficLights {
    public static void main(String[] args) {
        State current = TrafficLight.RED;
        System.out.println("Starts: " + current);
        
        for (int i = 1; i <= 6; i++) {
            current = current.next();
            System.out.println(i + ": " + current);
        }
    }
}
