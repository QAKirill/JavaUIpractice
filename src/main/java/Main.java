import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.SOUTH;
import static javax.swing.SwingConstants.SOUTH_EAST;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI"); // Для окна нужна "рама" - Frame
        JPanel buttonsPanel = new JPanel();
        JButton start = new JButton("Старт");
        JButton stop = new JButton("Стоп");

        int x = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
        int y = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();

        // стандартное поведение при закрытии окна - завершение приложения
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); // размеры окна
        //frame.setLocationRelativeTo(null); // окно - в центре экрана
        frame.setLocation(2260, 1140); //Почему так? Если разрешение экрана 3840х2160
        frame.setResizable(false);

        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
        // добавляем кнопки на панель
        buttonsPanel.add(start);
        buttonsPanel.add(stop);
        // размещаем панель на Frame (верхняя часть)
        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true); // Делаем окно видимым
    }
}