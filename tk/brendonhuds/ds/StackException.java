package tk.brendonhuds.ds;

public class StackException extends Exception {

    StackException() {};

    StackException(String msg) {
        super("Erro!\n"+msg);
    }


}
