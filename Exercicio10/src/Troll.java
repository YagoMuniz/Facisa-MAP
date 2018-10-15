public class Troll extends Character {

    @Override
    public void fight() {
        if(this.weaponBehavior != null)
        {
            this.weaponBehavior.useWeapon();
        }
    }

    public void setWeaponBehavior(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }
}
