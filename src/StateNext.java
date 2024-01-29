public class StateNext implements State{
    Brudnopis brudnopis;
    public StateNext(Brudnopis brudnopis) {
        this.brudnopis = brudnopis;
    }
    @Override
    public void Execute(String string) {
        //System.out.println("Stan : " + getClass().getName());
        System.out.println();
        if(brudnopis.position < brudnopis.text.size()) {
            brudnopis.position++;
        }
        for(int i = 0; i < brudnopis.position; i++) {
            System.out.println(brudnopis.text.get(i));
        }
    }
}
