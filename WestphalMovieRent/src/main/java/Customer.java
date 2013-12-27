/**
 * Created by haloz on 27.12.13.
 */
public class Customer {
    private float totalCharge = 0;

    public void rentMovie(int days) {
        // note: currently calling this method means to rent A NEW MOVIE, not to add rental days to an already rented movie!
        if(days > 2) {
            totalCharge += (days - 2) * 1.75;
        }
        totalCharge += 2.0;

    }

    public float getTotalCharge() {
        return totalCharge;
    }
}
