/**
 * Created by Jalpesh Vadgama on 29-03-2015.
 */
public class MethodParameters {

    public static void main(String[] args) {

        Robert robert = new Robert();
        robert.speak("Hello from Robert");
        robert.jump("Given command", 50);

    }
}

class Robert {
    public void speak(String message) {
        System.out.println(message);
    }

    public void jump(String message, int height) {
        System.out.print(message + " Jumping from height " + height + "feet");
    }
}