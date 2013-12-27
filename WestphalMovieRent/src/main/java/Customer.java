/**
 * Created by haloz on 27.12.13.
 */
public class Customer {
    private int totalCharge = 0;

    public void rentMovie(int days) {
        totalCharge += 2;

    }

    public int getTotalCharge() {
        return totalCharge;
    }
}
