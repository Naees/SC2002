public class SalePerson implements Comparable<SalePerson> {

    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    // Getter and setters (if needed)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalePerson)) return false;
        SalePerson other = (SalePerson) o;
        // Compare first and last name for equality (case-sensitive per spec)
        return (this.firstName == null ? other.firstName == null : this.firstName.equals(other.firstName))
                && (this.lastName == null ? other.lastName == null : this.lastName.equals(other.lastName));
    }

    @Override
    public int hashCode() {
        int result = (firstName == null) ? 0 : firstName.hashCode();
        result = 31 * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public int compareTo(SalePerson other) {
        // primary: totalSales descending (higher totalSales should compare greater)
        int cmp = Integer.compare(this.totalSales, other.totalSales);
        if (cmp != 0) return cmp;
        // tie-breaker: lastName ascending
        String ln1 = (this.lastName == null) ? "" : this.lastName;
        String ln2 = (other.lastName == null) ? "" : other.lastName;
        cmp = ln1.compareTo(ln2);
        if (cmp != 0) return cmp;
        // final tie-breaker: firstName ascending
        String fn1 = (this.firstName == null) ? "" : this.firstName;
        String fn2 = (other.firstName == null) ? "" : other.firstName;
        return fn1.compareTo(fn2);
    }
}