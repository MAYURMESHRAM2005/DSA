// import java.util.*;
// class Solution {
//     static class pair implements Comparable<pair>{
//         int val;
//         int indx;

//         public pair(int val,int indx){
//             this.val=val;
//             this.indx=indx;
//         }
//         public int compareTo(pair p2){
//             return p2.val-this.val;
//         }
//     }
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n=nums.length;
//         int[] res=new int[n-k+1];
//         PriorityQueue<pair> pq=new PriorityQueue<>();

//         for(int i=0;i<k;i++){
//             pq.add(new pair(nums[i],i));
//         }
//         res[0]=pq.peek().val;

//         for(int i=k;i<n;i++){
//             while(pq.size()>0 && pq.peek().indx<(i-k)){
//                 pq.remove();
//             }
//             pq.add(new pair(nums[i],i));
//             res[i-k+1]=pq.peek().val;
//         }
//         return res;
        
//     }
// }
import java.util.*;

class Solution {
    static class Pair implements Comparable<Pair> {
        int val;
        int indx;

        public Pair(int val, int indx) {
            this.val = val;
            this.indx = indx;
        }

        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(nums[i], i));
        }

        res[0] = pq.peek().val;

        for (int i = k; i < n; i++) {
            while (!pq.isEmpty() && pq.peek().indx <= i - k) {
                pq.remove();
            }

            pq.add(new Pair(nums[i], i));

            res[i - k + 1] = pq.peek().val;
        }

        return res;
    }
}