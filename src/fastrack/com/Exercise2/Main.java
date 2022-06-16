package fastrack.com.Exercise2;

public class Main {
    public static void main(String[] args) {
        ING ingAccount = new ING(150);
        BRD brdAccount = new BRD(180);
        BT btAccount = new BT(2800);
        BankAccount[] array = new BankAccount[]{ingAccount, brdAccount, btAccount};

        for(int index = 0; index < array.length; ++index) {
            array[index].deposit(10);
            array[index].withdraw(20);
        }
    }
}
