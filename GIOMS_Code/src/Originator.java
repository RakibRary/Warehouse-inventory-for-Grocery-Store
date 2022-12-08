
//This is the place that is required to include undo feature.

public class Originator
{

    private int state;

    public void setState(int state)
    {
        this.state = state;
    }

    public int getState()
    {
        return state;
    }

    public Memento saveStateToMemento()
    {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento)
    {
        state = memento.getState();
    }
}





















//public class Originator{
// 
//    private int state;
//    private int state2;
//    private int state3;
//
// 
//    public void setState(int meat)
//    {
//        this.state = meat;
//    }
//    
//    public void setState2(int produce)
//    {
//        this.state2 = produce;
//    }
//    
//    public void setState3(int dairy)
//    {
//        this.state3 = dairy;
//    }
// 
//    public int getState()
//    {
//        return state;
//    }
//    
//    public int getState2()
//    {
//        return state2;
//    }
//    
//    public int getState3()
//    {
//        return state3;
//    }
// 
//    public Memento saveStateToMemento()
//    {
//        return new Memento(state);
//    }
//    
//    public Memento saveStateToMemento2()
//    {
//        return new Memento(state2);
//    }
//    
//    public Memento saveStateToMemento3()
//    {
//        return new Memento(state3);
//    }
// 
//    public void getStateFromMemento(Memento memento)
//    {
//        state = memento.getState();
//    }
//    
//    public void getStateFromMemento2(Memento memento2)
//    {
//        state2 = memento2.getState();
//    }
//    
//    public void getStateFromMemento3(Memento memento3)
//    {
//        state3 = memento3.getState();
//    }
//}

//public class Originator {
//    private String content;
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public Memento createState() {
//        return new Memento(getContent());
//    }
//
//    public void restore(Memento state) {
//        content = state.getContent();
//    }
//
//}