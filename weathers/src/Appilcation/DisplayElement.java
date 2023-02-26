package Appilcation;

/**
 * 描述：为布告板建立一个共同都接口，布告板只需实现display方法 显示接口
 * Create a common interface for the bulletin board, and the bulletin board only needs to implement the display method display interface
 */
public interface DisplayElement {
	/**
	 * 当布告板要显示时，调用此方法
	 * This method is called when the bulletin board is to be displayed
	 */
	public void display();
}
