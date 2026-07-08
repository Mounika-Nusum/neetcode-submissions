class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->count.get(b)-count.get(a));
        for(int key: count.keySet()){
            pq.offer(key);
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;
        
    }
}
