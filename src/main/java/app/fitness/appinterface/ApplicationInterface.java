package app.fitness.appinterface;

import app.fitness.system.NutritionPlan;
import app.fitness.system.NutritionPlanBuilder;
import app.fitness.system.WeightLossNutritionPlanBuilder;

public class ApplicationInterface {
    public static void main(String[] args) {

        String[] mealPlan = new String[]{
                "1/2 cup gluten-free oats",
                "1 cup almond milk",
                "1/2 cup mixed berries",
                "1 tablespoon chia seeds"
        };

        NutritionPlanBuilder nutritionPlanBuilder = new WeightLossNutritionPlanBuilder();
        NutritionPlan nutritionPlan = nutritionPlanBuilder
                .setCaloricIntake(1600)
                .setMacronutrientRatios(45,30,25)
                .setMealPlans(mealPlan)
                .setDietaryRestrictions(new String[]{"Gluten-Free"})
                .build();

        System.out.println(nutritionPlan.toString());

    }
}
