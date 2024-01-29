public class StateWrite implements State{
    Brudnopis brudnopis;
    public StateWrite(Brudnopis brudnopis) {
        this.brudnopis = brudnopis;
    }
    @Override
    public void Execute(String string) {
       // System.out.println("Stan : " + getClass().getName());
        brudnopis.text.put(brudnopis.position, string);
        brudnopis.position++;
        //System.out.print("> ");
    }
}
