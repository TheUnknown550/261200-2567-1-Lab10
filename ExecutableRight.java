public class ExecutableRight implements Runnable{
    Turtle Right;
    public ExecutableRight(Turtle Right){
        this.Right = Right;
    }
    
    @Override
    public void run(){
        Right.penColor("black");
        Right.width(5);
        Right.forward(50);
        Right.left(90);
        Right.forward(115);
        Right.up();
        Right.left(135);
        Right.forward(38);
        Right.down();
        Right.right(90);
        for(int i = 0; i<40; i++){
            Right.forward(5);
            Right.left(10);
        }
        Right.up();
        Right.forward(300);
    }
}
