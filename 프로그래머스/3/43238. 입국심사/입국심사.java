class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long min = 0;
        long max = (long) n * times[times.length - 1];

        while (min <= max) {
            long mid = (min + max) / 2;
            long comple = 0;
            for (int i = 0; i < times.length; i++)
                comple += mid / times[i];
            if (comple < n) {
                min = mid + 1;
            } else {
                max = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}