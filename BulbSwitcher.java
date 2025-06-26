class BulbSwitcher {
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;

        while (i*i <= n){
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        BulbSwitcher bs = new BulbSwitcher();
        int n = 20; // Example input
        int result = bs.bulbSwitch(n);
        System.out.println("Number of bulbs that are on after " + n + " switches: " + result);
        // Expected output: 3, since bulbs 1, 4, and 9 will be on.
    }
}
