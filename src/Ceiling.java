import Enums.PaintColor;

public class Ceiling {
    private int height ;
    private PaintColor paintedColor ;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create (){

        System.out.println( "Ceiling: (Height: "+getHeight()+" m Painted Color: "+getPaintedColor()+")" );
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                "m, paintedColor=" + paintedColor +
                '}';
    }
}
