public class FoodNode {
    Food food;
    FoodNode next;

    public FoodNode(Food food) {
        this.food = food;
        this.next = null;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public FoodNode getNext() {
        return next;
    }

    public void setNext(FoodNode next) {
        this.next = next;
    }
}
