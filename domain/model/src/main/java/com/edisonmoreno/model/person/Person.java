package com.edisonmoreno.model.person;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
public class Person {
    private String id;
    private Float balance;

    private String name;
    private String lastname;
}
