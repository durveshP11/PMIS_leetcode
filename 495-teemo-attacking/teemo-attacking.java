class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totTime = timeSeries.length * duration;
        int totDiff = 0;
        for(int i = 0; i < timeSeries.length - 1; i++){
            if(timeSeries[i] + duration >= timeSeries[i+1]){
                totDiff += timeSeries[i] + duration - timeSeries[i+1];
                }
}
                    return totTime - totDiff;

        
    }
}