package DrawText;

import java.util.Scanner;

public class ScanIn {

    public String getText() {

        System.out.println("Please input a wor to be drawn:");

        Scanner Input = new Scanner(System.in);
        String text = Input.next();
        text = text.toUpperCase();
        return text;
    }
}
