public class ExecutableLeft implements Runnable{
    Turtle Left;
    public ExecutableLeft(Turtle Left){
        this.Left = Left;
    }
    @Override
    public void run(){
        Left.penColor("black");
        Left.width(5);
        Left.left(180);
        Left.forward(50);
        Left.right(90);
        Left.forward(115);
        Left.right(180);
        Left.forward(50);
        Left.right(90);
        Left.forward(80);
        Left.left(90);
        Left.forward(65);
        Left.left(90);
        Left.forward(260);
        Left.left(90);
        Left.forward(65);
        Left.left(90);
        Left.forward(80);
        Left.up();
        Left.forward(48);
        Left.right(90);
        Left.forward(5);
        Left.down();
        Left.forward(20);
        Left.right(180);
        Left.forward(20);
        Left.left(30);
        Left.forward(15);
        Left.up();
        Left.right(30);
        Left.forward(300);
    }
}
