public class AutoPolicyTest {
    public static void main(String[] args) {
         // create two AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(
                111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(
                222222, "Ford Fusion", "ME");

        // display whether each policy is in no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    // method that display whether an AutoPolicy is in a state with no-fault auto insurance
    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(),
                policy.getMakeAndModel(),
                policy.getState(),
                policy.isNoFaultState() ? "is": "is not");
    }
}
