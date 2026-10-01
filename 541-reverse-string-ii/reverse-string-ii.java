class Solution {
    public String reverseStr(String s, int k) {
        int l=0;
        int r=Math.min(k,s.length());
        char[] charArray=s.toCharArray();
        while(l<s.length()){
            reverse(charArray,l,r);
            l=l+2*k;
            r=Math.min(l+k,s.length());
        }
        return new String(charArray);
    }
    private static void reverse(char[] arr,int s,int e){
        while(s<e){
            char temp=arr[s];
            arr[s]=arr[e-1];
            arr[e-1]=temp;
            s++;
            e--;
        }
    }
}