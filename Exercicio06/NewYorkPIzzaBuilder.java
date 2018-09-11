public class NewYorkPizzaBuilder extends PizzaBuilder{

    public void createDough() {
        pizza.dough = new ThickCrustDough();
    }

    public void createSauce() {
        pizza.sauce =  new PlumTomatoSauce();
    }

    public void createCheese() {
        pizza.cheese =  new MozzarellaCheese();
    }

    public void createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach() };
        pizza.veggies =  veggies;
    }

    public void createPepperoni() {
        pizza.pepperoni =  new SlicedPepperoni();
    }

    public void createClam() {
        pizza.clam =  new FrozenClams();
    }

}