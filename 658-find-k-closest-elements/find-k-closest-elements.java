class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num:arr){
            if(k>0){
                minheap.offer(num);
                k--;
            }else if(Math.abs(minheap.peek()-x)>Math.abs(num-x)){
                minheap.poll();
                minheap.offer(num);
            }
        }
        while(!minheap.isEmpty()){
            ans.add(minheap.poll());
        }
        return ans;
    }
}