package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookCategory {
    @JsonProperty("id")
    private String category_Id;
    @JsonProperty("name")
    private String category_Name;
    public String getCategory_Id() {
        return category_Id;
    }
    public void setCategory_Id(String category_Id) {
        this.category_Id = category_Id;
    }
    public String getCategory_Name() {
        return category_Name;
    }
    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }
    @Override
    public String toString() {
        return "BookCategory{" +
                "id='" + category_Id + '\'' +
                ", name='" + category_Name + '\'' +
                '}';
    }
}
