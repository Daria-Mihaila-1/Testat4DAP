public class Testat {
    public static Fraction apply(Fraction[] arr, int i) {

        if (i < 0 | i >= arr.length) {
            return new Fraction(-1, 1);
        }
        if (i == 0) {
            if (arr[i].toDouble() >= 0 && arr[i].toDouble() <= 1) {
                return arr[i];
            } else {
                return new Fraction(0, 1);
            }
        }

        if (arr[i].toDouble() >= 0 && arr[i].toDouble() <= 1 ) {
            return apply(arr, i - 1).add(arr[i]);
        }
        else {
            return apply(arr, i - 1);
        }
    }
}

