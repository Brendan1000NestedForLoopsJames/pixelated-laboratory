import java.awt.*;

public class CreateColorSquare {
    public static void main(String[] args) {
        Picture colorSquare = new Picture(255, 255);
        for(int i = 0; i<255; i++){
            colorSquare.getPixel(i,0).setColor(new Color(128,128,128));
            colorSquare.getPixel(0,i).setColor(new Color(128,128,128));
        }
        for (int x = 1; x < 255; x++) {
            for (int y = 1; y < 255; y++) {
                colorSquare.getPixel(x,y).setColor(new Color(x,y,0));
            }
        }
        colorSquare.explore();
    }
}
