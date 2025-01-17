package javapractice.W3Resource.basic_part1;

public class UniqueThreeDigitNumbers {
    public static void main(String[] args) {
        int temp =0;
        for (int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                for (int z = 1; z<=4;z++){
                    if (i != j && j !=z && z !=i){
                        System.out.println(STR."\{i}\{j}\{z}");
                        temp++;
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
