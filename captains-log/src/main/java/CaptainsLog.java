import java.util.Random;

class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private static final Integer MIN_VALUE_NAVE = 1000;
    private static final Integer MAX_VALUE_NAVE = 10000;
    private static final double MIN_VALUE_DATE = 41000.0;
    private static final double RANGE_VALUE_DATE = 1000.0;

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int sorteio = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[sorteio];
    }

    String randomShipRegistryNumber() {
        int naveNumber = MIN_VALUE_NAVE + random.nextInt(MAX_VALUE_NAVE - MIN_VALUE_NAVE);
        return String.format("NCC-%d",naveNumber);
    }

    double randomStardate() {
        return MIN_VALUE_DATE + RANGE_VALUE_DATE * random.nextDouble();
    }
}
