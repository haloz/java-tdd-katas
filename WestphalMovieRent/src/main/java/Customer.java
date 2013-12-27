/**
 * Created by haloz on 27.12.13.
 */
public class Customer {
    private double totalCharge = 0;

    public void rentMovie(int days) {
        totalCharge += Movie.getCharge(days);
    }

    public double getTotalCharge() {
        return totalCharge;
    }
}
