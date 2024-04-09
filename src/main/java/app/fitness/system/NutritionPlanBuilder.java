package app.fitness.system;

import app.fitness.system.enums.FitnessGoalType;

public abstract class NutritionPlanBuilder {
    protected int dailyCaloricIntake;
    protected int[] macronutrientRatios;
    protected String[] mealPlans;
    protected FitnessGoalType fitnessGoal;
    protected String[] dietaryRestrictions;

    public abstract NutritionPlanBuilder setCaloricIntake(int caloricIntake);

    public abstract NutritionPlanBuilder setMacronutrientRatios(int carbs, int proteins, int fats);

    public abstract NutritionPlanBuilder setMealPlans(String[] mealPlans);

    public abstract NutritionPlanBuilder setFitnessGoal(FitnessGoalType fitnessGoal);

    public abstract NutritionPlanBuilder setDietaryRestrictions(String[] dietaryRestrictions);

    public abstract NutritionPlan build();
}
