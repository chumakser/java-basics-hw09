import java.util.ArrayList;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */
  public static Object[] findCommon(String[] array1, String[] array2) {
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < array1.length; i++)
    {
      for (int j = 0; j < array2.length;j++)
      {
        if (array1[i].equals(array2[j]))
        {
          list.add(array1[i]);
        }
      }
    }
    return list.toArray();
  }
}