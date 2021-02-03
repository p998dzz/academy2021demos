public class NumberProgressBar {

    int MAX_LENGTH = 100;
    int MIN_LENGTH = 0;

    int currentStatus;

    public NumberProgressBar(){
        currentStatus = 0;
    }

    public void printProgress() {
        System.out.print("Progress: " + currentStatus + "%\r");
    }

    public void increaseProgress(int increaseByPercentage) {
        if(currentStatus + increaseByPercentage <= MAX_LENGTH){
            currentStatus += increaseByPercentage;
        } else {
            currentStatus = MAX_LENGTH;
        }
    }

    public void restartProgress() {
        currentStatus = MIN_LENGTH;
    }
}
