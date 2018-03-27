package pl.korbasoftware.reactpoc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class SimpleEntityDTO {
    private Long id;
    private int age;
    private String city;
    private int experience;
    private List<String> technologies;
    private int salaryNet;
}
