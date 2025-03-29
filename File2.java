import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class File2 {
    public static void main(String[] args) throws ScriptException {
        File1 obj = new File1();
        System.out.println(obj.add(2, 2));

        // Using GraalVM JavaScript engine (replace with your preferred JavaScript engine)
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("graal.js");
        if(engine == null) {
            System.out.println("JavaScript engine not found. Please install GraalVM.");
            return;
        }
        engine.eval(new java.io.FileReader("guessnumber.js"));
        engine.eval("guessNumberGame(1,100);");
    }
}
