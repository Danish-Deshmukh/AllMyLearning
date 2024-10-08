package section11Abstraction.interfaces;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

public interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description) {

        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }
    private void logStage(FlightStages stage,String description) {

        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage,"Beginning Transition to " + nextStage);
        return nextStage;
    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;
    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeoff() {

        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {

        achieveOrbit();
        transition("Data Collection while Orbiting");
    }
    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}
