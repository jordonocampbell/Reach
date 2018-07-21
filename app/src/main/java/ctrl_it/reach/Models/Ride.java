package ctrl_it.reach.Models;

public class Ride {
    private String date;
    private String description;
    private String label;
    private String image;

    public Ride(){

    }
    public Ride(String date, String description, String label, String image) {
        this.date = date;
        this.description = description;
        this.label = label;
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
