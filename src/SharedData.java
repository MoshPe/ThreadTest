import java.util.ArrayList;

/**
 * A <code>SharedData</code> Object to check if a sum of given array
 * of integers is equal to a given <code>int</code> B  
 * @author MoshPe
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Init <code>SharedData</code> fields
	 * @param array - given array of integer to init
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * 
	 * @return An array of booleans, true is added to each number that was added
	 * 			to the sum. 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Set <code>winArray</code> with given array
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Return the list of given numbers
	 * @return <code>ArrayList<Integer></code> of the given numbers
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
