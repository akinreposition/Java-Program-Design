package DesignPattern.mosh.state.abuse;

public class Stopwatch {
    private  boolean isRunning;

    public void click(){
        if (isRunning){
            isRunning = false;
            System.out.println("stopped");
        }else{
            isRunning = true;
            System.out.println("running");
        }
    }
}
