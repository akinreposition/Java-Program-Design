package DesignPattern.mosh.state;

// This class respond to mouse events
// like mouse up or down.
public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp (){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
