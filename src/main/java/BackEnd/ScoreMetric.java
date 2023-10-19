/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author Saien Naidu
 */
public class ScoreMetric {

    public static boolean points = false;
    public static boolean time = false;
    public static boolean winORlose = false;
    public static boolean rating = false;

    public static String pointChoice_method(String choice) {

        if (points == false) {
            points = true;
            choice = "points";
        } else {
            points = false;
            choice = "";
        }

        return choice;
    }

    public static String timeChoice_method(String choice) {

        if (time == false) {
            time = true;
            choice = "time";
        } else {
            time = false;
            choice = "";
        }

        return choice;

    }

        public static String winORLoseChoice_method(String choice) {

        if (winORlose == false) {
            winORlose = true;
            choice = "winORlose";
        } else {
            winORlose = false;
            choice = "";
        }

        return choice;

    }
        
    public static String ratingChoice_method(String choice) {

        if (rating == false) {
            rating = true;
            choice = "rating";
        } else {
            rating = false;
            choice = "";
        }

        return choice;

    }
}
