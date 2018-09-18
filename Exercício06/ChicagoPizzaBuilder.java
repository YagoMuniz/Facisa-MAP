public class ChicagoPizzaBuilder extends PizzaBuilder{

    public void createDough() {
        pizza.dough = new ThinCrustDough();
    }

    public void createSauce() {
        pizza.sauce = new MarinaraSauce();
    }

    public void createCheese() {
        pizza.cheese = new ReggianoCheese();
    }

    public void createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
        pizza.veggies = veggies;
    }

    public void createPepperoni() {
        pizza.pepperoni = new SlicedPepperoni();
    }

    public void createClam() {
        pizza.clam = new FreshClams();
    }

}