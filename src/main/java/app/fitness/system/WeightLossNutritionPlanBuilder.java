package app.fitness.system;

import app.fitness.system.enums.FitnessGoalType;

public class WeightLossNutritionPlanBuilder extends NutritionPlanBuilder {

    public WeightLossNutritionPlanBuilder() {
        this.fitnessGoal = FitnessGoalType.Weight_Loss;
    }

    @Override
    public NutritionPlanBuilder setCaloricIntake(int caloricIntake) {
        this.dailyCaloricIntake = caloricIntake;
        return this;
    }

    @Override
    public NutritionPlanBuilder setMacronutrientRatios(int carbs, int proteins, int fats) {
        this.macronutrientRatios = new int[]{carbs, proteins, fats};
        return this;
    }

    @Override
    public NutritionPlanBuilder setMealPlans(String[] mealPlans) {
        this.mealPlans = mealPlans;
        return this;
    }

    @Override
    public NutritionPlanBuilder setFitnessGoal(FitnessGoalType fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
        return this;
    }

    @Override
    public NutritionPlanBuilder setDietaryRestrictions(String[] dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
        return this;
    }

    @Override
    public NutritionPlan build() {
        return new NutritionPlan(dailyCaloricIntake, macronutrientRatios, fitnessGoal, dietaryRestrictions, mealPlans);
    }
}
