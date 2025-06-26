class Tibonacci {
    public int tribonacci(int n) {
       if(n == 0){
        return 0;
       } 
       else if(n == 1 || n == 2){
        return 1;
       }
       else{
        int frist = 0;
        int second = 1;
        int third = 1;

        for (int i =1; i<=n; i++){
            int forth = frist + second + third;

            frist = second;
            second = third;
            third = forth;
        }
        return frist;
       }
    }
}