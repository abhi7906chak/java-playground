
// In this code object's tostring method is coverd 
// 07/feb/2024
// Author => Abhishek Chak

class Food {
    int item;
    float quality;

    Food() {
        this.item = 1;
        this.quality = 9.9f;
    }

    @Override
    // @Author
    public String toString() {
        Food food = new Food();

        System.out.println(this.item + " "
                + this.quality + " " + food.getClass()
                + " " + food.hashCode()
                + " " + super.toString() + " " + super.getClass());
        return "good working";
    }
}

public class collection_prectice_1 {
    public static void main(String[] args) {

        Food food = new Food();
        collection_prectice_1 col = new collection_prectice_1();
        System.out.println(food);
        System.out.println(col);
    }
}
