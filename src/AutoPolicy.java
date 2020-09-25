public class AutoPolicy {
    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    // constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // set the accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // return the accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // set makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    // returns the makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    // set the state
    public void setState(String state) {
        this.state = state;
    }

    // returns the state
    public String getState() {
        return state;
    }

    // predict method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {
        // get AutoPolicy object's state abbreviation
        boolean noFaultState = switch (getState()) {
            case "MA", "NJ", "NY", "PA" -> true;
            default -> false;
        };

        // determine whether state has no-fault auto insurance
        return noFaultState;
    } // end class AutoPolicy

}
