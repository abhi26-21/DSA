class Solution {
    public int findNumbers(int[] nums) {
            int count=0;
            for(int num:nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
    }
    static Boolean even(int num){
        int find=digits(num);
        return find%2==0;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}