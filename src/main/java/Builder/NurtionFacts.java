package Builder;

public class NurtionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        private final int servingSize;
        private final int servings;

        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public Builder(int servingSize, int servings){
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int value){
            this.calories = value;
            return this;
        }

        public Builder fat(int value){
            this.fat = value;
            return this;
        }

        public Builder sodium(int value){
            this.sodium = value;
            return this;
        }

        public Builder carbohydrate(int value){
            this.carbohydrate = value;
            return this;
        }

        public NurtionFacts build(){
            return new NurtionFacts(this);
        }

    }

    private NurtionFacts(Builder builder){
        servings = builder.servings;
        servingSize = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "servings: " + this.servings + " servingSize: " + this.servingSize + " calories: " + this.calories +
                " fat: " + this.fat + " sodium: " + this.sodium + " carbohydrate: " + this.carbohydrate;
    }
}
