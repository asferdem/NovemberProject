package pojo;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Data
public class Department {
    private int department_id;
    private String department_name;
    private int manager_id;
    private int location_id;

}