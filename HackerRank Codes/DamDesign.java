	//Virtusa Test-3 - Dam Design
class Result {
		/*Complete the 'maxHeight' function below.The function is expected to return an INTEGER.
			The function accepts following parameters:
			1. INTEGER_ARRAY wallPositions
			2. INTEGER_ARRAY wallHeights*/

	public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
				// Write your code here
		int l=0;
		for (int i=0; i<wallPositions.size()-1; i++) {
			if (wallPositions.get(i)<wallPositions.get(i+1)-1) {
				int height = Math.abs(wallHeights.get(i+1) - wallHeights.get(i));
				int gap = wallPositions.get(i+1) - wallPositions.get(i) - 1;
				int localMax = 0;
				if (gap > height) {
					int low = Math.max(wallHeights.get(i+1), wallHeights.get(i)) + 1;
					int remainingGap = gap - height - 1;
					localMax = low + remainingGap/2;
				} 
				else {
					localMax = Math.min(wallHeights.get(i+1), wallHeights.get(i)) + gap;
				}
				l= Math.max(l, localMax);
			}
		}
		return l;
	}
}
