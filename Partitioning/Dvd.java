package Dvd_Pack;

/**
 *
 * @author STEPHEN HOEY
 */
public class Dvd {

    private int Id;
    private String Title;
    private String Format;
    private int Rating;

    public Dvd(int i, String t, String f, int r) {
        this.Id = i;
        this.Title = t;
        this.Format = f;
        this.Rating = r;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTittle() {
        return Title;
    }

    public void setTittle(String Title) {
        this.Title = Title;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String Format) {
        this.Format = Format;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        this.Rating = rating;
    }

    public String toString1() {
        return "Id = " + Id + ", Title = " + Title + ", Format = " + Format + ", Rating = " + Rating;
    }

    public String toString() {
        String out = "ID:" + Id + "\n";
        out += "Format:" + Format + "\n";
        out += "Title:" + Title + "\n";
        out += "Rating:" + Rating + "\n";
        return out;
    }
}
