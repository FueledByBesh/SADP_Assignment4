package app.fitness.system;

import app.fitness.system.enums.FitnessGoalType;

public class NutritionPlan {

    private int dailyCaloricIntake;
    private int[] macronutrientRatios;
    private FitnessGoalType fitnessGoal;
    private String[] dietaryRestrictions;
    private String[] mealPlans;

    public NutritionPlan(int dailyCaloricIntake, int[] macronutrientRatios, FitnessGoalType fitnessGoal,
                         String[] dietaryRestrictions, String[] mealPlans) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.macronutrientRatios = macronutrientRatios;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
        this.mealPlans = mealPlans;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fitness Goal: ").append(fitnessGoal).append("\n");
        builder.append("Daily Caloric Intake: ").append(dailyCaloricIntake).append(" kcal\n");
        builder.append("Macronutrient Ratios: Carbohydrates: ").append(macronutrientRatios[0])
                .append("%, Proteins: ").append(macronutrientRatios[1])
                .append("%, Fats: ").append(macronutrientRatios[2]).append("%\n");
        builder.append("Dietary Restrictions: ");
        for (String restriction : dietaryRestrictions) {
            builder.append(restriction).append(" ");
        }
        builder.append("\nMeal Plans:\n");
        for (String meal : mealPlans) {
            builder.append("- ").append(meal).append("\n");
        }
        return builder.toString();
    }

}
