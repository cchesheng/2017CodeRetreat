public abstract class Cell {
    state currentState;
    public enum state {
        ALIVE, DEAD;
    }
    public state GetState(){
        return currentState;
    }
    public state GetNextState(){
        return state.ALIVE;
    }

}
