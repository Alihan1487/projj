import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моё окно");
        JButton button = new JButton("Нажми меня");

        frame.add(button); // добавляем кнопку
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
