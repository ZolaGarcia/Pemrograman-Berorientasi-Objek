import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockDisplay extends JFrame {
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public ClockDisplay() {
        // Set window title
        setTitle("Jam Real-Time");

        // Initialize the time format with hours, minutes, and seconds
        timeFormat = new SimpleDateFormat("HH:mm:ss");

        // Create a label to display the time
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("SansSerif", Font.BOLD, 50));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Set up the JFrame
        setLayout(new BorderLayout());
        add(timeLabel, BorderLayout.CENTER);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Timer to update the time every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start(); // Start the timer

        setVisible(true); // Show the window
    }

    // Method to update the time label
    private void updateTime() {
        String currentTime = timeFormat.format(new Date());
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        // Run the clock application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClockDisplay();
            }
        });
    }
}
