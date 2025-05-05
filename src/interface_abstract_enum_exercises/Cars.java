package interface_abstract_enum_exercises;

enum RightOfWay {DEDICATED, SHARED, MIXED }

class Cars {
    String name;
    RightOfWay rightOfWay;

    Cars(String name, RightOfWay rightOfWay) {
        this.name = name;
        this.rightOfWay = rightOfWay;
    }

    void displayInfo() {
        System.out.println("Vehicle: " + name);
        System.out.println("Right of Way: " + rightOfWay);
        System.out.println(" ");
    }
}

class Bus extends Cars {
    Bus() {
        super("Bus", RightOfWay.MIXED);
    }
}

class UrbanRail extends Cars {
    UrbanRail() {
        super("Urban Rail", RightOfWay.SHARED);
    }
}

class CommuterRail extends Cars {
    CommuterRail() {
        super("Commuter Rail", RightOfWay.DEDICATED);
    }
}

class MBTAVehicles {
    public static void main(String[] args) {
        Cars bus = new Bus();
        Cars urbanRail = new UrbanRail();
        Cars commuterRail = new CommuterRail();

        bus.displayInfo();
        urbanRail.displayInfo();
        commuterRail.displayInfo();
    }
}
