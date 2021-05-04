package clientModule;

import javax.swing.*;

import clientModule.forms.InsertForm.Insert;
import clientModule.forms.LoginForm.Login;
import clientModule.forms.MainMenuForm.MainMenu;
import clientModule.forms.RegisterForm.Register;
import clientModule.forms.RemoveByWeaponForm.RemoveByWeapon;
import clientModule.forms.RemoveGreaterForm.RemoveGreater;
import clientModule.forms.RemoveKeyForm.RemoveKey;
import clientModule.forms.ShowForm.Show;
import clientModule.forms.StartMenuForm.*;
import clientModule.forms.UpdateForm.Update;

public class App {
    public static final JFrame mainFrame = new JFrame("SpaceMarine");
    public static Insert insert;
    public static Login login;
    public static MainMenu mainMenu;
    public static Register register;
    public static RemoveByWeapon removeByWeapon;
    public static RemoveGreater removeGreater;
    public static RemoveKey removeKey;
    public static Show show;
    public static StartMenu startMenu;
    public static Update update;

    public static void main(String[] args) {
        Client client = new Client("localhost", 20002);
        insert = new Insert(client);
        login = new Login(client);
        mainMenu = new MainMenu(client);
        register = new Register(client);
        removeByWeapon = new RemoveByWeapon(client);
        removeGreater = new RemoveGreater(client);
        removeKey = new RemoveKey(client);
        show = new Show(client);
        startMenu = new StartMenu(client);
        update = new Update(client);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setContentPane(startMenu.getStartMenuPanel());
        mainFrame.setVisible(true);
    }
}

