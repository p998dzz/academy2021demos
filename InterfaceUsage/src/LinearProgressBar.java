
public class LinearProgressBar {

    int MAX_LENGTH = 100;
    int MIN_LENGTH = 0;

    int currentStatus;

    public LinearProgressBar(){
        currentStatus = MIN_LENGTH;
    }

    public void printProgress() {
        System.out.print('[');
        for(int i = MIN_LENGTH; i < MAX_LENGTH; i+=5){
            if(i < currentStatus){
                System.out.print('█');
            } else {
                System.out.print(' ');
            }
        }
        System.out.print(']');
        System.out.print('\r');
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
