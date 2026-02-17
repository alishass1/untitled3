
public class AfishaManager {
    private Film[] films = new Film[0];
    private int limit;

    public AfishaManager() {
        this.limit = 5;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public void add(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {

        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        Film[] result = new Film[resultLength];
        
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }

        return result;
    }
}