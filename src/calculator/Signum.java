package calculator;

public class Signum {
    int getSignum(int number){
        if(number>0){
            return 1;
        } else if (number==0) {
            return 0;
        }
        else return -1;
    }
    double getSignum(String strNumber){
        int number=Integer.parseInt(strNumber);
        if(number>0){
            return 1;
        } else if (number==0) {
            return 0;
        }
        else return -1;
    }
}
