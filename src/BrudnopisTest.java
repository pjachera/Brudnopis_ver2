import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class BrudnopisTest {


    public static void main(String[] args) {

        Brudnopis brudnopis = new Brudnopis();
        brudnopis.changeState(brudnopis.stateWrite);

        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("############ Notatnik - brudnopis #############");
        System.out.println("Write commends (next, prev, exit) or Write Text");


        while (true) {
            System.out.print("> ");
            if (scanner.hasNextLine()) {

                input = scanner.nextLine();

                if (input.equals("exit")) {
                    break;
                }
                else if (input.equals("next")) {
                    brudnopis.changeState(brudnopis.stateNext);
                    brudnopis.Execute(input);
                }
                else if (input.equals("prev")) {
                    brudnopis.changeState(brudnopis.statePrev);
                    brudnopis.Execute(input);
                }
                else {
                    brudnopis.changeState(brudnopis.stateWrite);
                    brudnopis.Execute(input);
                }
            }
        }

        System.out.println("Historia stanow : ");
        brudnopis.stateMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Date, String>comparingByKey())
                .forEach(System.out::println);
    }
}
