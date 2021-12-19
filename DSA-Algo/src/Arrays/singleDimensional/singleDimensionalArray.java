package Arrays.singleDimensional;

public class singleDimensionalArray {
	int arr[] = null;

	public singleDimensionalArray(int n) {
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Value succesfully inserted");

			} else {
				System.out.println("Location already occupied");
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid index to access array");
			
		}


	}

}
