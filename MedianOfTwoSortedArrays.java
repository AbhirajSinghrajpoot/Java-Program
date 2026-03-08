public class MedianOfTwoSortedArrays {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for optimization
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;
        
        while (low <= high) {
            // Partition nums1
            int partitionX = (low + high) / 2;
            // Partition nums2 such that left half has (m+n+1)/2 elements
            int partitionY = (m + n + 1) / 2 - partitionX;
            
            // Handle edge cases: if partition is at the beginning or end
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            
            // Check if we found the correct partition
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // If total length is even
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    // If total length is odd
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // Move towards left in nums1
                high = partitionX - 1;
            } else {
                // Move towards right in nums1
                low = partitionX + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
    
    public static void main(String[] args) {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        
        // Test Case 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Test Case 1:");
        System.out.println("nums1 = [1, 3], nums2 = [2]");
        System.out.println("Median = " + solution.findMedianSortedArrays(nums1, nums2));
        System.out.println("Expected: 2.00000\n");
        
        // Test Case 2
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Test Case 2:");
        System.out.println("nums1 = [1, 2], nums2 = [3, 4]");
        System.out.println("Median = " + solution.findMedianSortedArrays(nums3, nums4));
        System.out.println("Expected: 2.50000\n");
        
        // Test Case 3: Empty first array
        int[] nums5 = {};
        int[] nums6 = {1};
        System.out.println("Test Case 3:");
        System.out.println("nums1 = [], nums2 = [1]");
        System.out.println("Median = " + solution.findMedianSortedArrays(nums5, nums6));
        System.out.println("Expected: 1.00000\n");
        
        // Test Case 4: Larger arrays
        int[] nums7 = {1, 2, 3, 4, 5};
        int[] nums8 = {6, 7, 8, 9, 10};
        System.out.println("Test Case 4:");
        System.out.println("nums1 = [1, 2, 3, 4, 5], nums2 = [6, 7, 8, 9, 10]");
        System.out.println("Median = " + solution.findMedianSortedArrays(nums7, nums8));
        System.out.println("Expected: 5.50000\n");
        
        // Test Case 5: Negative numbers
        int[] nums9 = {-5, -3, -1};
        int[] nums10 = {-4, -2, 0};
        System.out.println("Test Case 5:");
        System.out.println("nums1 = [-5, -3, -1], nums2 = [-4, -2, 0]");
        System.out.println("Median = " + solution.findMedianSortedArrays(nums9, nums10));
        System.out.println("Expected: -2.50000\n");
    }
}
