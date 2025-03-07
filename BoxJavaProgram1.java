class Box {
double width;
double height;
double depth;
}
//box java program
public class BoxJavaProgram {
    public static void main(String[] args){
        Box mybox = new Box();
        double vol;
        mybox.width = 20;
        mybox.height = 30;
        mybox.depth = 10;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}
