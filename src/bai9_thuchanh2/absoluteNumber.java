package bai9_thuchanh2;

public  class absoluteNumber {
    public static int getAbsoluteNumber(int number){
        int absoluteNumber;
        if (number>=0){
            absoluteNumber = number;
        }else {
            absoluteNumber = -number;
        }
        return absoluteNumber;
    }
}
