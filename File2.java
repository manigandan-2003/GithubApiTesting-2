class File2{
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.class File2{
    public static void main(String[] args) {
        System.out.println(add(2, 2));

        // Call guessnumber.js
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");

            // Execute the JavaScript code from the file
            engine.eval(new java.io.FileReader("guessnumber.js"));

            // Optionally, you can invoke functions defined in the JavaScript file
            // In this example, assuming guessnumber.js has a function 'guessNumberGame()'
             javax.script.Invocable inv = (javax.script.Invocable) engine;
             inv.invokeFunction("guessNumberGame", 1, 100);

        } catch (ScriptException e) {
            System.err.println("ScriptException: " + e.getMessage());
        } catch (java.io.FileNotFoundException e) {
            System.err.println("FileNotFoundException: guessnumber.js not found");
        } catch (NoSuchMethodException e) {
            System.err.println("NoSuchMethodException: Function not found in guessnumber.js");
        }
    }
}));
 } }
