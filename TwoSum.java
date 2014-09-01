public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sortedArray = new int[numbers.length];
        System.arraycopy(numbers,0,sortedArray,0,numbers.length);
        Arrays.sort(sortedArray);
        int start = 0;
        int end = sortedArray.length - 1;

        while(start < end)
        {
            if(sortedArray[start] + sortedArray[end] < target)
            {
                start++;
                continue;
            }
            else if(sortedArray[start] + sortedArray[end] > target)
            {
                end--;
                continue;
            }
            else
            {
                break;                
            }
        }
        int index1 = -1;
        int index2 = -1;
        for(int i=0; i < numbers.length; i++)
        {
            if(numbers[i] == sortedArray[start] || numbers[i] == sortedArray[end])
            {
                if(index1 == -1)
                {
                    index1 = i+1;
                }
                else
                {
                    index2 = i+1;
                }
            }
        }
        
        int[] result = new int[]{index1, index2};
        Arrays.sort(result);
        
        return result;
        
    }
}