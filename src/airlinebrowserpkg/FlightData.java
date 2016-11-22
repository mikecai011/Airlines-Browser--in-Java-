package airlinebrowserpkg;

/**
 * This interface contains methods that return the basic information of the
 * object that implements this interface of the objects. It is also used to be
 * able create an ArrayList of different classes of objects when reading a file.
 * 
 * @author Michael D. Cai
 * @version 1.0
 * @since JDK 7
 * @since May 2016
 */
public interface FlightData {
	//method to get string information of the object
	public String getStringInfo(String info);

	//method to get integer information of the object
	public int getIntInfo(String info);
}
