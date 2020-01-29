package us.mattgreen;

import javax.naming.NameAlreadyBoundException;
import java.util.Scanner;
public class user{
    Scanner keyboard = new Scanner(System.in);
    private String name = " ";


    public int GetMiceKilled(){
        boolean huh = true;
        int micekill = 0;
        while (!huh) {
           huh = false;
            System.out.println("Please enter amount of mice killed");
            try {
                micekill = keyboard.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("error");  huh=true;
            } catch (Exception e) {
                System.out.println("error"); huh=true;
            }
        }
        return micekill;
    }
    public String getName(){
        String name = " ";
        boolean valid = false;
        while (!valid){
        System.out.println("please enter name");
        name=keyboard.nextLine();
        valid = checkName(name);

        }
        return keyboard.nextLine();
    }
    public boolean checkName(String name){
        return (!name.isEmpty()&&name != null&& name !="Bob");
        }
    }
