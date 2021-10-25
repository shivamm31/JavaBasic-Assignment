package Ques2;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int flag = 1;
        int b_nums[] = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < b_nums.length; i++) {
            if (b_nums[i] == 0) {
                count++;
            }
            else if(b_nums[i] == 1){
                flag++;
            }
        }
        for(int i=0; i<count; i++){
            b_nums[i] = 0;
        }
        for(int i=count; i<b_nums.length; i++){
            b_nums[i] = 1;
        }
        for(int val: b_nums){
            System.out.println(val+" ");
        }
    }
}
