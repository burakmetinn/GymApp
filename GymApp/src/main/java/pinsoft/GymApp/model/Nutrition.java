package pinsoft.GymApp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="nutrition")
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nutritionId")
    private int nutritionId;

    @Column(name="name")
    private String name;

    @Column(name="protein")
    private double protein;

    @Column(name="carbonhydrate")
    private double carbonhydrate;

    @Column(name="fat")
    private double fat;

    @Column(name="kcal")
    private double kcal;





}
