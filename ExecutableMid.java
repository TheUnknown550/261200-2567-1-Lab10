

public class ExecutableMid implements Runnable{
    Turtle Mid;
    public ExecutableMid(Turtle Mid){
        this.Mid = Mid;
    }
    
    @Override
    public void run(){
        Mid.penColor("black");
        Mid.width(5);
        Mid.speed(2);
        Mid.up();
        Mid.left(90);
        Mid.forward(200);
        Mid.down();
        Mid.right(150);
        Mid.forward(100);
        Mid.right(120);
        Mid.forward(100);
        Mid.right(120);
        Mid.forward(100);
        Mid.left(30);
        Mid.forward(30);
        Mid.right(90);
        Mid.forward(30);
        Mid.right(135);
        Mid.forward(10);
        Mid.left(90);
        Mid.forward(10);
        Mid.right(135);
        Mid.forward(30);
        Mid.up();
        Mid.forward(300);
    }
}
