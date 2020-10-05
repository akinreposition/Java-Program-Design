package DesignPattern.mosh.memento;

import DesignPattern.mosh.state.BrushTool;
import DesignPattern.mosh.state.Canvas;
import DesignPattern.mosh.state.EraserTool;
import DesignPattern.mosh.state.SelectionTool;
import DesignPattern.mosh.state.abuse.Stopwatch;

public class Main {
    public static void main(String[] args) {
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());


//        Canvas canvas = new Canvas();
//        canvas.setCurrentTool(new EraserTool());
//        canvas.mouseDown();
//        canvas.mouseUp();

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }
}
