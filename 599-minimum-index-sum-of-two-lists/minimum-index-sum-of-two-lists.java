class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res=new ArrayList<>();
        HashMap<String,Integer> m=new HashMap<>();
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            m.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(m.containsKey(list2[i])){
                int sum=m.get(list2[i])+i;
                if(sum<minsum){
                minsum=sum;
                res.clear();
                res.add(list2[i]);
            }else if(sum==minsum){
                res.add(list2[i]);
            }
         }
            

        }
        return res.toArray(new String[0]);
    }
}