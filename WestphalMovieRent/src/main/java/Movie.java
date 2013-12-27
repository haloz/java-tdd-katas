/**
 * Created by slange on 27.12.13.
 */
public class Movie {
    private static final double BASE_PRICE = 2.00;
    private static final double PRICE_PER_DAY = 1.75;
    private static final int DAYS_DISCOUNTED = 2;

    public static double getCharge(int days) {
        double result = BASE_PRICE;
        // note: currently calling this method means to rent A NEW MOVIE, not to add rental days to an already rented movie!
        if(days > DAYS_DISCOUNTED) {
            result += (days - DAYS_DISCOUNTED) * PRICE_PER_DAY;
        }
        return result;
    }
}
