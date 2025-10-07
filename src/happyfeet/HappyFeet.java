/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happyfeet;

import happyfeet.view.ConsoleMenuView;
import java.text.ParseException;

/**
 *
 * @author Prog. Junior Daniel
 */   
public class HappyFeet {
    public static void main(String[] args) throws ParseException {
        ConsoleMenuView menu = new ConsoleMenuView();
        menu.mostrarMenu();
    }
}
