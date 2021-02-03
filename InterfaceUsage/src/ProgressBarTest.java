import java.io.Console;
import java.util.Scanner;

public class ProgressBarTest {

    /**
     * Slide 7
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {


        System.out.println();
        System.out.println("Different progress bars:");
        System.console().readLine();

        /**
         * Simple number progress bar.
         * Output:
         * Progress: 1%
         */
        NumberProgressBar progressBar = new NumberProgressBar();

        progressBar.restartProgress();

        for(int i = 0; i < 100; i++) {

            progressBar.increaseProgress(1);
            progressBar.printProgress();

            WaitForFiftyMilliseconds();
        }

        System.out.println();
        System.out.println();

        /**
         * Linear progress bar.
         * Output:
         * [#######              ]
         */
        LinearProgressBar progressBar2 = new LinearProgressBar();

        progressBar2.restartProgress();

        for(int i = 0; i < 100; i++) {

            progressBar2.increaseProgress(1);
            progressBar2.printProgress();

            WaitForFiftyMilliseconds();
        }

        System.out.println();
        System.out.println();


        /**
         * Generic (AKA Windows XP) progress bar
         * Output:
         * [   ###              ]
         */
        PlaceholderProgressBar progressBar3 = new PlaceholderProgressBar();

        progressBar3.restartProgress();

        for(int i = 0; i < 100; i++) {

            progressBar3.increaseProgress(1);
            progressBar3.printProgress();

            WaitForFiftyMilliseconds();
        }
    }

    private static void WaitForFiftyMilliseconds() throws InterruptedException {
        Thread.sleep(50);
    }
}
