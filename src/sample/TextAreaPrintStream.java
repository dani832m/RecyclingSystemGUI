package sample;

import javafx.scene.control.TextArea;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintStream;

public class TextAreaPrintStream extends PrintStream {

    //The TextArea to which the output stream will be redirected.
    private TextArea txt_Console;

    /**
     * Method TextAreaPrintStream
     * The constructor of the class.
     * The TextArea to which the output stream will be redirected.
     * A standard output stream (needed by super method)
     **/
    public TextAreaPrintStream(TextArea area, OutputStream out) {
        super(out);
        txt_Console = area;
    }

    /**
     * Method println
     * The String to be output in the TextArea textArea (private
     * attribute of the class).
     * After having printed such a String, prints a new line.
     **/
    public void println(String string) {
        txt_Console.appendText(string+"\n");
    }



    /**
     * Method print
     * The String to be output in the TextArea textArea (private
     * attribute of the class).
     **/
    public void print(String string) {
        txt_Console.appendText(string);
    }

}
