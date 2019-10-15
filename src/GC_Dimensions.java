import java.util.Scanner;

public class GC_Dimensions {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		
		double roomLength;
		double roomWidth;
		double roomHeight;
		double roomPerimeter;
		double roomArea;
		double roomVolume;
		String cont;
		
		do
		{
		System.out.println("Please enter the length of the room in feet: ");
		roomLength = scnr.nextDouble();
		System.out.println(roomLength);
		
		System.out.println("Please enter the width of the room in feet: ");
		roomWidth = scnr.nextDouble();
		System.out.println(roomWidth);
		
		System.out.println("Please enter the height of the room in feet: ");
		roomHeight = scnr.nextDouble();
		System.out.println(roomHeight);
		
		roomArea = roomLength * roomWidth;
		System.out.println("The area of the room is " + roomArea);
		
		roomPerimeter = 2*(roomLength + roomWidth);
		System.out.println("The perimeter of the room is " + roomPerimeter);
		
		roomVolume = roomLength * roomWidth * roomHeight;
		System.out.println("The volume of the room is " + roomVolume);
		
		System.out.println("\nWould you like the measurments of another room? (y/n)");
		cont = scnr.next();

		} while(cont.equalsIgnoreCase("y"));
		

	}

}
