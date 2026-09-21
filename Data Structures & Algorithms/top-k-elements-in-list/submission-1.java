
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        // 1. Đếm tần suất
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. bucket[freq] chứa các số xuất hiện freq lần
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // 3. Lấy từ tần suất lớn xuống
        int[] result = new int[k];
        int index = 0;

        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}