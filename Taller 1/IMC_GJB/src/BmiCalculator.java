public class BmiCalculator {

    private float weight;
    private float height;
    private float bmi;

    public BmiCalculator(float weight, float height) {
        this.weight = weight;
        this.height = height;
        calculate();
    }

    public void calculate() {
        this.bmi = (float) ((this.weight) / (Math.pow(this.height, 2)));
    }

    public String check_status() {
        if (this.bmi < 18.5f) {
            return "Bajo peso";
        } else if (this.bmi >= 18.5f && this.bmi < 24.9f) {
            return "Rango normal";
        } else if (this.bmi >= 24.9f && this.bmi < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public float getBmi() {
        return bmi;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
