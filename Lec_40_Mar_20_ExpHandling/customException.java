package Lec_40_Mar_20_ExpHandling;

class InsufficientBalance extends Exception{
    InsufficientBalance(String msg){
        super(msg);
    }
}
class InvalidSendersUPI extends RuntimeException{
    private int errorCode;
    InvalidSendersUPI(int code, String msg){
        super(msg);
        this.errorCode = code;
    }
    int getErrorCode(){
        return this.errorCode;
    }
}

public class customException {
    static void sendMoney(int amount, String upi) throws InsufficientBalance{
        if(amount > 500){
            throw new InsufficientBalance("Account Balance is low, Please earn more!!!");
        }
        if(upi.equals("9872564299")){
            throw new InvalidSendersUPI(501, "Don't send money to this number");
        }
    }
    public static void main(String[] args) {
        try{
            sendMoney(400, "7982143632");
        }
        catch(InsufficientBalance ex){
            System.out.println(ex.getMessage());
        }
    }
}
