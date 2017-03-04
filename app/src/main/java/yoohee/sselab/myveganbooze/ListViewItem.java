package yoohee.sselab.myveganbooze;

/**
 * Created by sec on 2017-03-02.
 */

public class ListViewItem {
    private int image;
    private String name;
    private String description;

    public ListViewItem(int img, String name, String des){
        this.image = img;
        this.name = name;
        this.description = des;
    }

    public int getImage() {
        return image;

    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
