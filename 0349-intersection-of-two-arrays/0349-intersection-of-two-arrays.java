class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store unique elements from nums1
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num); // Add all elements of nums1 to the set
        }

        // Use a list to store the intersection result
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultList.add(num); // Add common elements to the result list
                set.remove(num); // Remove the element to ensure no duplicates in the result
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}