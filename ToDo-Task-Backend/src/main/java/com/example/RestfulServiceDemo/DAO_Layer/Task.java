package com.example.RestfulServiceDemo.DAO_Layer;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "tasks")
public class Task {

    @Id
    private String id;
    private String description;
    private boolean completed;



}







