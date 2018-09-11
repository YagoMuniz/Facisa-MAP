
public abstract class PizzaBuilder{

    protected Pizza pizza = new Pizza();
    
    public abstract void createDough();
    public abstract void createSauce();
    public abstract void createCheese();
    public abstract void createVeggies();
    public abstract void createPepperoni();
    public abstract void createClam();

    public Pizza getPizza(){
        return this.pizza;
    }

}