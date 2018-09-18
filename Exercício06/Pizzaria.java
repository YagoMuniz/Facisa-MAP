public class Pizzaria{
    protected PizzaBuilder pizzaBuilder;

    public Pizzaria(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public void createPizza(){
        pizzaBuilder.createDough();
		pizzaBuilder.createSauce();
		pizzaBuilder.createCheese();
		pizzaBuilder.createVeggies();
		pizzaBuilder.createPepperoni();
		pizzaBuilder.createClam();
    }

    public Pizza getPizza() {
        return this.pizzaBuilder.getPizza();
    }
}
