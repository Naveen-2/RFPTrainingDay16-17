
public class PermutationOfString{
    static int count=0;
	public static void main(String[] args){
		String str = "ABCD";
		int n = str.length();
		PermutationOfString permutation = new PermutationOfString();
		permutation.permutate(str, 0, n-1);
        System.out.println("Number of permutactions for the given string is " + count);
	}

	/**
	* permutate - method to 
	* @param str string to calculate permutation for
	* @param firstIndex starting index
	* @param lastIndex last index
	*/
	private void permutate(String str, int firstIndex, int lastIndex){
        

        /**
         * If first index and last index are equal, 
         * it'll directly print the String
         * 
         * count variable is incremented to get number of 
         * permutations of given string
         */
		if (firstIndex == lastIndex){
			System.out.println(str);
            count++;
        }else{

            /**
             * At first, firstIndex and i are same so it'll call 
             * this function recursively with firstIndex+1 repeatedly
             * till last two characters in strings are swapped.
             */
			for (int i = firstIndex; i <= lastIndex; i++){
				str = swap(str,firstIndex,i);
				permutate(str, firstIndex+1, lastIndex);
				str = swap(str,firstIndex,i);
			}
		}
	}

	/**
	* swap Characters at position
    *
	* @param a string value
	* @param i position 1
	* @param j position 2
	* @return swapped string
	*/
	public String swap(String a, int i, int j){
		char temp;
        /*
         * The string parameter a is converted to character array 
         */
		char[] charArray = a.toCharArray();

        /**
         * the characters in indices i and j and swapped by using a 
         * temporary variable.
         */
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;

        /**
         * the character array will be converted to string 
         * and returned.
         */
		return String.valueOf(charArray);
	}

}
