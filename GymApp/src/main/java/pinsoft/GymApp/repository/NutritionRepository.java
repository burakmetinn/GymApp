package pinsoft.GymApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pinsoft.GymApp.model.Nutrition;

public interface NutritionRepository extends JpaRepository<Nutrition,Integer> {


}
