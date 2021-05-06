package lambada;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @author liubin
 */

public class LambadaTest
{
    public static void main(String[] args)
    {
        var plantes = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(plantes));
        System.out.println("Sorted in dicrionary:");
        Arrays.sort(plantes);
        System.out.println(Arrays.toString(plantes));
        System.out.println("Sorted by length:");
        Arrays.sort(plantes, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plantes));

        var time = new Timer(1000, event -> System.out.println("Time is " + new Date()));
        time.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
