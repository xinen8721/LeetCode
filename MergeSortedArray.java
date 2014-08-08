public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        if(A == null || B == null) return;
        if(A.length == 0 && B.length == 0) return;
        if(A.length == 0 && B.length != 0)
        {
            System.arraycopy( B, 0, A, 0, B.length );
        }
        int newLength =  m + n;
        int indexA = m - 1;
        int indexB = n - 1;
        
        int runningIndex = newLength - 1;
        for(; indexA >= 0 && indexB >=0;)
        {
            if(B[indexB] >= A[indexA])
            {
                A[runningIndex--] = B[indexB--];
            }
            // B[indexB] < A[indexA]
            else
            {
                A[runningIndex--] = A[indexA--];
            }
        }
        
        while(indexB >= 0)
        {
            A[runningIndex--] = B[indexB--];
        }
        
        
    }
}