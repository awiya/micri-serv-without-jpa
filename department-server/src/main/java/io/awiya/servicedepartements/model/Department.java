package io.awiya.servicedepartements.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
