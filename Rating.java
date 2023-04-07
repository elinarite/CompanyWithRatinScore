package TaskWork.BasicForAll4;

public enum Rating {
    A(1.2),
    B(1.15),
    C(1.05),
    D(0),
    E(0.95);

    private final double ratingScore;

    Rating(double ratingScore) {
        this.ratingScore = ratingScore;
    }

    public double getRatingScore() {
        return ratingScore;
    }
}