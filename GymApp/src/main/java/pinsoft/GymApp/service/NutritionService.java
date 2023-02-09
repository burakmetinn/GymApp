package pinsoft.GymApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pinsoft.GymApp.core.DataResult;
import pinsoft.GymApp.core.Result;
import pinsoft.GymApp.core.SuccessDataResult;
import pinsoft.GymApp.core.SuccessResult;
import pinsoft.GymApp.model.Nutrition;
import pinsoft.GymApp.repository.NutritionRepository;

import java.util.List;


@Service
public class NutritionService {

    NutritionRepository nutritionRepository;

    @Autowired
    public NutritionService(NutritionRepository nutritionRepository){
        this.nutritionRepository=nutritionRepository;
    }

    public Result addNutrition(Nutrition nutrition){
        nutritionRepository.save(nutrition);
        return new SuccessResult("Nutrition added.");
    }

    public Result deleteNutrition(int id){
        nutritionRepository.deleteById(id);
        return new SuccessResult("Nutrition deleted.");
    }

    public DataResult<List<Nutrition>> getAll(){
        return new SuccessDataResult<List<Nutrition>>(
                this.nutritionRepository.findAll(),"All data has been retrieved.");
    }

    // public List<Nutrition> getAll(Nutrition nutrition){
       //  return nutritionRepository.findAll();
    // }



}
