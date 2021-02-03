public class PlaceholderProgressBar{

    int MAX_LENGTH = 20;
    int MIN_LENGTH = 0;

    int currentPosition;

    public PlaceholderProgressBar(){
        currentPosition = -3;
    }

    public void printProgress() {
        System.out.print('[');
        for(int i = 0; i < MAX_LENGTH; i+=1){
            if(i >= 0 && i < 20){
                if (i >= currentPosition-3 && i<currentPosition) {
                    System.out.print('█');
                } else {
                    System.out.print(' ');
                }
            }
        }
        currentPosition++;
        if(currentPosition > MAX_LENGTH+3){
            currentPosition = MIN_LENGTH;
        }
        System.out.print(']');
        System.out.print('\r');
    }

    public void increaseProgress(int percentage) {
        //Nobody cares
    }

    public void restartProgress() {
        currentPosition = -3;
    }
}
