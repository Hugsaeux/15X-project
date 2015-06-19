/**
 * 
 * Very basic object to hold user information
 * 
 * @author Hughes Lee
 *
 */

public class User {
	
	// User information
	public int ID;
	private String name;
	private int x, y;
	private String status;
	
	// Create new blank user
	public User(){
	}
	
	// Create new User with name
	public User(String username){
		name = username;
	}
	
	// Create new User with ID and name
	public User(int userID, String username){
		ID = userID;
		name = username;
	}
	
	// Get user's name
	public String getName(){
		return name;
	}
	
	// Get user's latitude
	public int getX(){
		return x;
	}
	
	// Get user's longitude
	public int getY(){
		return y;
	}
	
	// Get user's status
	public String getStatus(){
		return status;
	}
	
	// Update user's status
	public void setStatus(String newStatus){
		status = newStatus;
	}
	
	// Update user's location
	public void setLocation(int newX, int newY){
		x = newX;
		y = newY;
	}
	
	// Change user's name
	public void setName(String newName){
		name = newName;
	}
}
