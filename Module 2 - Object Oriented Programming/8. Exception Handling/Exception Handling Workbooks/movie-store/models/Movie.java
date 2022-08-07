package models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }

        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("format cannot be null/blank");
        }

        if (!format.equalsIgnoreCase("DVD") && !format.equalsIgnoreCase("Blue-Ray")) {
            throw new IllegalArgumentException("Format should be either 'DVD' or 'Blue-Ray'");
        }

        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating should be between 0 and 10");
        }

        this.name = name;
        this.format = format;
        this.rating = rating;
        this.isAvailable = true;
        this.sellingPrice = format.equals("DVD") ? 2.25 : 4.25;
        this.rentalPrice = format.equals("DVD") ? 0.99 : 1.99;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("format cannot be null/blank");
        }

        if (!format.equalsIgnoreCase("DVD") && !format.equalsIgnoreCase("Blue-Ray")) {
            throw new IllegalArgumentException("Format should be either 'DVD' or 'Blue-Ray'");
        }

        this.format = format;
        setSellingPrice(format.equals("DVD") ? 2.25 : 4.25);
        setRentalPrice(format.equals("DVD") ? 0.99 : 1.99);
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating should be between 0 and 10");
        }
        this.rating = rating;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String toString() {
        return "\t Name: " + this.name + "\n" +
                "\t Format: " + this.format + "\n" +
                "\t Rating: " + this.rating + "\n" +
                "\t Selling Price: " + this.sellingPrice + "\n" +
                "\t Rental Price: " + this.rentalPrice + "\n" +
                "\t Availability: " + (this.isAvailable ? "in-stock": "rented") + "\n";
    }
}
