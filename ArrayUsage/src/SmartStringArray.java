public class SmartStringArray {

    private static final int INITIAL_SIZE = 5;
    private int arraySize;
    private String[] array;

    public SmartStringArray(){
        array = new String[INITIAL_SIZE];
        arraySize = array.length;
    }

    public String[] getArray(){
        return array;
    }

    /**
     * Slide 5
     * implement:
     * add
     * clear
     * contains
     * remove
     * isEmpty
     */
}
