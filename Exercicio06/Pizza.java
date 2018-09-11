
public class Pizza{

    public Dough dough;
	public Sauce sauce;
	public Cheese cheese;
	public Veggies[] veggies;
	public Pepperoni pepperoni;
	public Clams clam;

}

public interface Clams {
	public String toString();
}

public interface Cheese {
	public String toString();
}

public interface Sauce {
	public String toString();
}

public interface Dough {
	public String toString();
}

public interface Pepperoni {
	public String toString();
}

public class FreshClams implements Clams {

	public String toString() {
		return "Fresh Clams from Long Island Sound";
	}
}

public class ReggianoCheese implements Cheese {

	public String toString() {
		return "Reggiano Cheese";
	}
}

public class MarinaraSauce implements Sauce {
	public String toString() {
		return "Marinara Sauce";
	}
}

public class ThinCrustDough implements Dough {
	public String toString() {
		return "Thin Crust Dough";
	}
}

public class SlicedPepperoni implements Pepperoni {
	public String toString() {
		return "Sliced Pepperoni";
	}
}

public class FrozenClams implements Clams {
	public String toString() {
		return "Frozen Clams";
	}
}

public class MozzarellaCheese implements Cheese {

	public String toString() {
		return "Mozzarella Cheese";
	}
}

public class ThickCrustDough implements Dough {
	public String toString() {
		return "Thick Crust Dough";
	}
}


public class PlumTomatoSauce implements Sauce {
	public String toString() {
		return "Plum Tomato Sauce";
	}
}

public interface Veggies{}
	public class BlackOlives implements Veggies{}
	public class Spinach implements Veggies{}
	public class Eggplant implements Veggies{}