class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
	Arrays.sort(arr);
	var mad = Integer.MAX_VALUE; // minimum absolute difference
	for (var i = 1; i < arr.length; i++)
		mad = Math.min(mad, arr[i] - arr[i - 1]);

	var diffs = new ArrayList<List<Integer>>();
	for (var i = 1; i < arr.length; i++)
		if (arr[i] - arr[i - 1] == mad)
			diffs.add(List.of(arr[i - 1], arr[i]));
	return diffs;
    }
}