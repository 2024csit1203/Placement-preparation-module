class Solution {
    public int sumOfMultiples(int n) {
        int a = 1;
        int sum = 0;
        while (a <= n) {
            if (a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
                sum = sum + a;
            }
            a++;
        }
        return sum;
    }
}