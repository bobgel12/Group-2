
public class FloorPanelConfiguration 
{
	static private String floorPanelQueueType = "default";
	static FloorPanelColor buttonColor = FloorPanelColor.GREEN;
	static FloorPanelColor activeButtonColor = FloorPanelColor.YELLOW;
	static private String textType = "symbol";
	static private int cars; 

	public static String getTextType() {
		return textType;
	}

	public static void setTextType(String textType) {
		FloorPanelConfiguration.textType = textType;
	}

	public static String getfloorPanelQueueType() {
		return floorPanelQueueType;
	}

	public static void setfloorPanelQueueType(String floorPanelQueueType) {
		FloorPanelConfiguration.floorPanelQueueType = floorPanelQueueType;
	}
	
	public static FloorPanelColor getActiveButtonColor() {
		return activeButtonColor;
	}
	public static void setActiveButtonColor(FloorPanelColor activeButtonColor) {
		FloorPanelConfiguration.activeButtonColor = activeButtonColor;
	}
	public static FloorPanelColor getButtonColor() {
		return buttonColor;
	}
	public static void setButtonColor(FloorPanelColor buttonColor) {
		FloorPanelConfiguration.buttonColor = buttonColor;
	}
	
	/** Added for external alarm display, Snigdha, CMPE 287, Fall 2011**/
	public static void setNumberOfCars(int cars) {
		FloorPanelConfiguration.cars = cars;
	}

	public static int getNumberOfCars() {
		return cars;
	}
	//------
}
