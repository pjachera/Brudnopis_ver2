import java.util.*;

public class Brudnopis implements State{
    State stateWrite;
    State stateNext;
    State statePrev;
    State state;
    Map<Integer, String> text = new HashMap<>();
    Map<Date, String> stateMap = new HashMap<>();
    int position = 0;
    public Brudnopis() {
        stateWrite = new StateWrite(this);
        stateNext = new StateNext(this);
        statePrev = new StatePrev(this);
    }
    public void changeState(State state){
        this.state = state;
        stateMap.put(new Date(
                System.currentTimeMillis()), state.getClass().getName());
    }
    @Override
    public void Execute(String string) {
        state.Execute(string);
    }
}