		//Fewest Coins

class Result {

	/*Complete the 'fewestCoins' function below. The function is expected to return an INTEGER.
		The function accepts STRING coins as parameter.*/

	static final int MAX_CHARS = 256;
	public static int fewestCoins(String coins) {
				// Write your code here
		int dcount=0;
		boolean[] visited = new boolean[MAX_CHARS];
		Arrays.fill(visited, false);
		for (int i = 0; i < coins.length(); i++) {
			if (visited[coins.charAt(i)] == false) {
				visited[coins.charAt(i)] = true;
				dcount+=1;
			}
		}
		int start = 0;
		int minlen = Integer.MAX_VALUE;
		int count = 0;
		int[] ccount = new int[MAX_CHARS];
		for (int j = 0; j < coins.length(); j++){
			ccount[coins.charAt(j)]++;
			if (ccount[coins.charAt(j)] == 1)
				count++;
			if (count == dcount) {
				while (ccount[coins.charAt(start)] > 1) {
					if (ccount[coins.charAt(start)] > 1)
						ccount[coins.charAt(start)]--;
					start++;
				}
				int len = j - start + 1;
				if (minlen > len) {
					minlen = len;
				}
			}
		}
		return minlen;
	}
}
