class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==1)
        {
            int m=n*2;
            return m;
        }
        else
        {
            int m=n;
            return m;
        }
    }
}