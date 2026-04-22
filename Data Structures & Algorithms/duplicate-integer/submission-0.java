class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> duplicateValue =  new HashSet<>();

        for(int num : nums){
            if(duplicateValue.contains(num))
            return true;
            duplicateValue.add(num);
        }
        return false;
    }
}