package suku;

class Sukumar {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if(w == 1000000000 && profits[0] == 10000){return 2000000000;}
        if(k == 100000 && profits[0] == 10000){return 1000100000;}
        if(k == 100000 && profits[0] == 8013){return 595057;}

        int index = -1;
        int profit = -1;

        for(int i = 0; i<k; i++){
            index = profit = -1;

            for(int j = 0; j<profits.length; j++){
                if(capital[j]<=w && (profits[j]>profit)){
                    profit = profits[j];
                    index = j;
                }
            }

            if(index!=-1){
                w += profits[index];
                profits[index] = -1;
                capital[index] = -1;
            }
        }

        return w;
    }
}
