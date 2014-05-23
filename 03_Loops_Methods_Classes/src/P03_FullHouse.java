import java.util.ArrayList;
import java.util.List;


public class P03_FullHouse {

	public static String[] faces = new String[] { 
		"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A" };
	public static String[] suits = new String[] { "♣", "♦", "♥", "♠" };
	
	public static void main(String[] args) {
		
		int count = 0;
        for (int i = 0; i < faces.length; i++) {
        	for (int j = 0; j < faces.length; j++) {
        		if (i != j) {
        			for (int first = 0; first < suits.length; first++) {
        				for (int second = first + 1; second < suits.length; second++) {
        					for (int third = second + 1; third < suits.length; third++) {
        						for (int fourth = 0; fourth < suits.length; fourth++) {
        							for (int fifth = fourth + 1; fifth < suits.length; fifth++) {
        								count++;
        								System.out.println(faces[i] + suits[first] + " " + faces[i] + suits[second]
        										+ " " + faces[i] + suits[third] + " " + faces[j] + suits[fourth]
        										+ " " + faces[j] + suits[fifth]);
        								}
        							}
        						}
        					}
        				}
        			}
        		}
        	}
        System.out.println(count + " full houses");
        }
	
}
