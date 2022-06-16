package fastrack.com.Exercise2;

public class Main {
    public static void main(String[] args) {
        ING ingAccount = new ING(100);
        BRD brdAccount = new BRD(200);
        BT btAccount = new BT(300);
        BankAccount[] array = new BankAccount[]{ingAccount, brdAccount, btAccount};

        for(int index = 0; index < array.length; ++index) {
            array[index].deposit(10);
            array[index].withdraw(20);
        }
    }
}
