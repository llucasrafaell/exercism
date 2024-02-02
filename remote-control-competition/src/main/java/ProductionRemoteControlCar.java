class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int distance = 0;
    int victories = 0;

    public void drive() {
        distance += 10;
    }
    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories += numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        // Para ordem decrescente, subtraia o número de vitórias do outro carro pelo deste carro
        return otherCar.getNumberOfVictories() - this.getNumberOfVictories();
    }
    
}
