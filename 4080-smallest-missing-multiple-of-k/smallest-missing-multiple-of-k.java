class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            if(num%k==0){
                set.add(num);
            }
        } 
        int curr=k;
        while(set.contains(curr)){
            curr+=k;
        }
        return curr;
    }
}