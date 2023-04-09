package TaskWork.BasicForAll4;

public enum Rating {
    A(1.2),
    B(1.15),
    C(1.05),
    D(0),
    E(0.95);


    // TODO слово Rating  в названии избыточно, это итак уже рейтинг просто value достаточно
    // Будет Rating.getValue - "получить значение ретинга"

    private final double ratingScore;

    Rating(double ratingScore) {
        this.ratingScore = ratingScore;
    }


    public double getRatingScore() {
        return ratingScore;
    }
}