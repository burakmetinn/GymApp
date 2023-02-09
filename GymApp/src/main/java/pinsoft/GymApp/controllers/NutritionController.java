package pinsoft.GymApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pinsoft.GymApp.core.DataResult;
import pinsoft.GymApp.core.Result;
import pinsoft.GymApp.model.Nutrition;
import pinsoft.GymApp.service.NutritionService;


import java.util.List;

@RestController
@RequestMapping("/api/nutrition/")
public class NutritionController {

    NutritionService nutritionService;

    @Autowired
    public NutritionController(NutritionService nutritionService){
        this.nutritionService=nutritionService;
    }

    @PostMapping("addNutrition")
    public Result addNutrition(@RequestBody Nutrition nutrition){
        return nutritionService.addNutrition(nutrition);
    }

    @DeleteMapping("deleteNutrition")
    public Result deleteNutrition( int id){
        return nutritionService.deleteNutrition(id);
    }


    @GetMapping("getAllNutritions")
    public DataResult<List<Nutrition>> getAll(){
        return this.nutritionService.getAll();
    }

  // @GetMapping("getAllNutrition")
  //  public List<Nutrition> getAll(Nutrition nutrition){
  //      return nutritionService.getAll(nutrition);
  //  }







}
