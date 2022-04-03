/**
 * Purpose  -  ability to analyse and respond Happy or Sad Mood
 * @author  - Shubham Pawar
 * @version - 16.0
 * @since   - 01-04-2022
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    private String message;

    /**
     * default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message=message;
    }
    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
