class Solution {
    public int clumsy(int n) {

        int ans = 0;
        int temp = n;

        n--;

        int operation = 0;

        while (n > 0) {

            if (operation == 0) {
                // *
                temp = temp * n;
            }

            else if (operation == 1) {
                // /
                temp = temp / n;
            }

            else if (operation == 2) {
                // +
                ans = ans + temp;
                temp = n;
            }

            else {
                // -
                ans = ans + temp;
                temp = -n;
            }

            operation++;

            if (operation == 4) {
                operation = 0;
            }

            n--;
        }

        // Add the last remaining value
        ans = ans + temp;

        return ans;
    }
}