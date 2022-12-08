
//This class consists of all revertible fields(in this example, it keeps the content field). An instance of this class is taken as the state.

public class Memento
{

    private int state;

    public Memento(int state)
    {
        this.state = state;
    }

    public int getState()
    {
        return state;
    }
}







//public class Memento
//{
// 
//    private int state;
//    private int state2;
//    private int state3;
//
// 
//    public Memento(int state)
//    {
//        this.state = state;
//    }
//    
//    public Memento2(int state2)
//    {
//        this.state2 = state2;
//    }
// 
//    public Memento2(int state3)
//    {
//        this.state3 = state3;
//    }
// 
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
//}

//public class Memento {
//    private final String content;
//
//    public Memento(String content) {
//        this.content = content;
//    }
//
//    public String getContent() {
//        return content;
//    }
//}