public class StatePrev implements State{
    Brudnopis brudnopis;
    public StatePrev(Brudnopis brudnopis) {
        this.brudnopis = brudnopis;
    }
    @Override
    public void Execute(String string) {
        //System.out.println("Stan : " + getClass().getName());
        System.out.println();
        if(brudnopis.position > 0){
            brudnopis.position--;
        }
        for(int i = 0; i < brudnopis.position; i++) {
            System.out.println(brudnopis.text.get(i));
        }
    }
}
