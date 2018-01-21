package DrawText;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        ScanIn scan = new ScanIn();
        String text = scan.getText();
        Draw drawer = new Draw();
        drawer.drawtext(text);
    }
}
