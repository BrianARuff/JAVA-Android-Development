public class Loan {
    double loanAmount;
    double interestRate;
    double total;

    public void setTotal(double newLoanAmount, double newInterestRate){
        this.loanAmount = newLoanAmount;
        this.interestRate = newInterestRate;
        total = newLoanAmount * newInterestRate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                ", total=" + total +
                '}';
    }
}

class LoanApp {
    public static void main(String[] args) {
        Loan loanOne = new Loan();

        System.out.println(loanOne.toString());
    }
}