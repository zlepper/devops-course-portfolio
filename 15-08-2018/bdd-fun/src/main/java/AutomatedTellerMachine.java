public class AutomatedTellerMachine {
    int content;
    ResponseObject response;

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public ResponseObject makeDeposit(Account account, int content) {
        account.deposit(content);
        return response = new ResponseObject(200, "Deposit successful");
    }

    public ResponseObject makeWithdrawal(Account account, int withdrawal) {
        account.withdraw(withdrawal);
        return response = new ResponseObject(200, "Withdrawal successful");
    }
}
