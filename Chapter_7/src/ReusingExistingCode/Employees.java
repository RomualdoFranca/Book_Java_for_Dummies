package ReusingExistingCode;

import static java.lang.System.out;
public class Employees {

    private String name;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitleIn) {
        this.jobTitle = jobTitleIn;
    }

    public void cutCheck(double amountPaid) {
        out.printf("Pay the order of %s ", name);
        out.printf("(%s) ***$", jobTitle);
        out.printf("%,.2f\n", amountPaid);

    }
}
