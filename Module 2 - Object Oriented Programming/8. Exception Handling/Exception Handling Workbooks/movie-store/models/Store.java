package models;

import java.util.ArrayList;


public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public Movie getMovie(String name) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                return new Movie(this.movies.get(i));
            } 
        }
        return null;
    }
    
    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void action(String movieName, String action) {
        if (this.movies.isEmpty()) {
            throw new IllegalStateException("Store is empty");
        }

        if (!(action.equals("sell") || action.equals("rent") || action.equals("return"))) {
            throw new IllegalArgumentException("Invalid action, must be sell, rent or return");
        }
        
        if (movieName == null || movieName.isBlank()) {
            throw new IllegalArgumentException("Movie name cannot be blank/null");
        }

        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(movieName)) {
                if (action.equals("return")) {
                    this.movies.get(i).setAvailable(true);
                } else if (action.equals("sell")) {
                    if (!this.movies.get(i).isAvailable()) {
                        throw new IllegalStateException("cannot sell rented movie");
                    }
                    this.movies.remove(i);
                } else if (action.equals("rent")) {
                    this.movies.get(i).setAvailable(false);
                }
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString() + "\n\n";
        }
        return temp;
    }

    // public void sellMovie(String movieName) {
    //     for (int i = 0; i < movies.size(); i++) {
    //         if (movies.get(i).getName().equals(movieName)) {
    //             this.movies.remove(i);
    //         }
    //     }
    // }

    // public void rentMovie(String movieName) {
    //     for (int i = 0; i < movies.size(); i++) {
    //         if (movies.get(i).getName().equals(movieName)) {
    //             this.movies.get(i).setAvailable(false);
    //         }
    //     }
    // }

    // public void returnMovie(String movieName) {
    //     for (int i = 0; i < movies.size(); i++) {
    //         if (movies.get(i).getName().equals(movieName)) {
    //             this.movies.get(i).setAvailable(true);
    //         }
    //     }
    // }

}
