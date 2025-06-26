class newBottle {
    public int numWaterBottles(int numBottle, int numExchange) {
        int ans = numBottle;
        
        while (numBottle >= numExchange) {
            int newBottle = numBottle / numExchange;
            int remBottle = numBottle % numExchange;

            ans = ans + newBottle;
            numBottle = newBottle + remBottle;
        }
        return ans;
    }
}