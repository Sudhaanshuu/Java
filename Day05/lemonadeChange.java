class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean paid = false;
        int five_count = 0;
        int ten_count = 0;
        for(int i = 0;i<bills.length;i++){
            if(bills[i] == 5){
                five_count++;
                paid = true;
            }
            if(bills[i] == 10){
                if(five_count >=1){
                    five_count--;
                    paid = true;
                    ten_count++;
                } else {
                    paid = false;
                }

                if(paid == false){
                    break;
                }
                
            }
            if(bills[i] == 20){
                if(five_count>=1 &&  ten_count >=1){
                    five_count--;
                    ten_count--;
                    paid = true;
                } else if (five_count >= 3){
                    five_count -= 3;
                    paid = true;
                }
                 else {
                    paid = false;
                }

                if(paid == false){
                    break;
                }
            }
        }
        return paid;
    }
}
