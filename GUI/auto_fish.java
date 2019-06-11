package GUI;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import converter.text_to_key;

public class auto_fish extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private static JLabel mouseGlobalLocation;
	public static JButton ill_setLocation, ftl_setLocation;
	public static JTextField iil_x, iil_y, ftl_x, ftl_y;
	public static JButton start_afk, stop_afk;
	private static JLabel display_gameStatus;

	public static int mouseGlobeXLoc, mouseGlobeYLoc;
	public static boolean isSettingiil, isSettingftl;
	private static String line, pidInfo;
	private static boolean isTerrariaRunning, isAbleToRun;
	private static int fishDupeCount, bot_delay;

	public auto_fish() {
		setTitle("Terraria Super Auto Fisher");
		setResizable(false);
		setBounds(0, 0, 300, 243);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel inv_item_location = new JPanel();
		inv_item_location.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true),
				"Inventory Item Location", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		inv_item_location.setBounds(10, 11, 133, 120);
		contentPane.add(inv_item_location);
		inv_item_location.setLayout(null);

		JLabel lblX = new JLabel("X:");
		lblX.setBounds(10, 24, 46, 14);
		inv_item_location.add(lblX);

		iil_x = new JTextField();
		iil_x.setBounds(32, 21, 86, 20);
		inv_item_location.add(iil_x);
		iil_x.setColumns(10);

		iil_y = new JTextField();
		iil_y.setBounds(32, 49, 86, 20);
		inv_item_location.add(iil_y);
		iil_y.setColumns(10);

		JLabel lblY = new JLabel("Y:");
		lblY.setBounds(10, 52, 46, 14);
		inv_item_location.add(lblY);

		ill_setLocation = new JButton("Set Location");
		ill_setLocation.setBounds(10, 80, 108, 23);
		inv_item_location.add(ill_setLocation);

		JPanel fish_to_location = new JPanel();
		fish_to_location.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true),
				"Rod Throw Location", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		fish_to_location.setBounds(153, 11, 133, 120);
		contentPane.add(fish_to_location);
		fish_to_location.setLayout(null);

		JLabel lblX_1 = new JLabel("X:");
		lblX_1.setBounds(10, 24, 46, 14);
		fish_to_location.add(lblX_1);

		ftl_x = new JTextField();
		ftl_x.setBounds(37, 21, 86, 20);
		fish_to_location.add(ftl_x);
		ftl_x.setColumns(10);

		ftl_y = new JTextField();
		ftl_y.setBounds(37, 49, 86, 20);
		fish_to_location.add(ftl_y);
		ftl_y.setColumns(10);

		JLabel lblY_1 = new JLabel("Y:");
		lblY_1.setBounds(10, 52, 46, 14);
		fish_to_location.add(lblY_1);

		ftl_setLocation = new JButton("Set Location");
		ftl_setLocation.setBounds(10, 80, 113, 23);
		fish_to_location.add(ftl_setLocation);

		start_afk = new JButton("Start (F1)");
		start_afk.setEnabled(false);
		start_afk.setBounds(10, 142, 133, 23);
		contentPane.add(start_afk);

		stop_afk = new JButton("Stop (F2)");
		stop_afk.setEnabled(false);
		stop_afk.setBounds(10, 176, 133, 23);
		contentPane.add(stop_afk);

		JLabel lblGameStatus = new JLabel("Game Status: ");
		lblGameStatus.setBounds(153, 146, 133, 14);
		contentPane.add(lblGameStatus);

		display_gameStatus = new JLabel("Not Running");
		display_gameStatus.setForeground(Color.RED);
		display_gameStatus.setBounds(153, 160, 119, 14);
		contentPane.add(display_gameStatus);

		mouseGlobalLocation = new JLabel("");
		mouseGlobalLocation.setBounds(153, 180, 131, 14);
		contentPane.add(mouseGlobalLocation);

		ill_setLocation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ill_setLocation.setEnabled(false);
				isSettingiil = true;
			}
		});

		ftl_setLocation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ftl_setLocation.setEnabled(false);
				isSettingftl = true;
			}
		});

		start_afk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				start_afk.setEnabled(false);
				stop_afk.setEnabled(true);

				text_to_key.hasOKClicked = false;
			}
		});

		stop_afk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				start_afk.setEnabled(true);
				stop_afk.setEnabled(false);
			}
		});

		update();
	}

	private static void update() {
		new Thread()
		{
			public void run()
			{
				while (true)
				{
					mouseGlobeXLoc = MouseInfo.getPointerInfo().getLocation().x;
					mouseGlobeYLoc = MouseInfo.getPointerInfo().getLocation().y;

					mouseGlobalLocation.setText("X: " + mouseGlobeXLoc + "     " + "Y: " + mouseGlobeYLoc);

					// Check if any of the X and Y coordinates have letters or are null
					if
					(
						isTerrariaRunning &&
						iil_x.getText().matches("[0-9]+") &&
						!iil_x.getText().equals("") &&
						iil_y.getText().matches("[0-9]+") &&
						!iil_y.getText().equals("") &&
						ftl_x.getText().matches("[0-9]+") &&
						!ftl_x.getText().equals("") &&
						ftl_y.getText().matches("[0-9]+") &&
						!ftl_y.getText().equals("")
					)
					{
						if (!isAbleToRun)
						{
							start_afk.setEnabled(true);
							isAbleToRun = true;
						}
					}
					else
					{
						start_afk.setEnabled(false);
						stop_afk.setEnabled(false);

						isAbleToRun = false;
					}

					if (isAbleToRun && !start_afk.isEnabled() && stop_afk.isEnabled())
					{
						bot_delay = 100;

						// Sequence of Events to do in fishing
						try
						{
							// Gets the file location for your terraria files and it will get the key
							Path path = Paths.get(System.getProperty("user.home") + File.separatorChar + "Documents\\My Games\\Terraria\\input profiles.json");
							List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

							String textReplace;
							textReplace = "" + allLines.get(504).replace("      \"Inventory\": [\"", "").replace("\"],", "").toLowerCase();

							text_to_key.convetTextnKey(textReplace);
							
							Robot bot = new Robot();
							bot.keyPress(text_to_key.keyValue);
							bot.delay(bot_delay);
							bot.keyRelease(text_to_key.keyValue);
							bot.delay(bot_delay);
							bot.mouseMove(Integer.parseInt(iil_x.getText()), Integer.parseInt(iil_y.getText()));
							bot.delay(bot_delay);
							bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
							bot.delay(bot_delay);
							bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
							bot.delay(bot_delay);
							bot.mouseMove(Integer.parseInt(ftl_x.getText()), Integer.parseInt(ftl_y.getText()));
							bot.delay(bot_delay);
							bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
							bot.delay(bot_delay);
							bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
							bot.delay(bot_delay);
							bot.keyPress(text_to_key.keyValue);
							bot.delay(bot_delay);
							bot.keyRelease(text_to_key.keyValue);
							bot.delay(bot_delay);

							fishDupeCount++;
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}

						if (fishDupeCount == 1000)
						{
							fishDupeCount = 0;
							start_afk.setEnabled(true);
							stop_afk.setEnabled(false);
							isAbleToRun = false;
						}
					}
                }
            }
		}.start();
		
		new Thread()
		{
			public void run()
			{
				while (true)
				{
					line = "";
					pidInfo = "";

					Process p;
					try
					{
						p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
						BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));

						while ((line = input.readLine()) != null) {
							pidInfo += line; 
						}

						input.close();
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}

					if (pidInfo.contains("Terraria.exe"))
					{
						display_gameStatus.setText("Running");
						display_gameStatus.setForeground(Color.GREEN);

						isTerrariaRunning = true;
					}
					else
					{
						display_gameStatus.setText("Not Running");
						display_gameStatus.setForeground(Color.RED);

						isTerrariaRunning = false;
					}
				}
			}
		}.start();
    }
}