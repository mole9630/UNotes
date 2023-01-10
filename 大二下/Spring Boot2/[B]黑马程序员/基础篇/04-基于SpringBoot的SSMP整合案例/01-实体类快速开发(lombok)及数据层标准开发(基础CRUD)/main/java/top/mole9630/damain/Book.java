package top.mole9630.damain;

import lombok.Data;

@Data //lombok
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
