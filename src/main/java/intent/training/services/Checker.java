package intent.training.services;


public interface Checker {
    String getStatus();
    void prepareToTakeOff();
    default void loadFuel(int fuel) {}
    default void loadFuelInBalloon(int water,int gas) {}
    default int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    default boolean engineExist() {
        return false;
    }
}
