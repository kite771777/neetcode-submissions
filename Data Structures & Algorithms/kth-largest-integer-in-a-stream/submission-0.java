class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int n;
    public KthLargest(int k, int[] nums) {
        n=k;
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k) pq.poll();
        }
    }
    public int add(int val) {
        pq.add(val);
        if(pq.size()>n) pq.poll();
        return pq.peek();
    }
}
