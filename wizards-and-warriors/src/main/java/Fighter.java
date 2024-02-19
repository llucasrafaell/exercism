abstract class Fighter {

    protected boolean vulnerable = true;

    boolean isVulnerable() {
        return vulnerable;
    }

    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        }
        else
            return 6;
    }

    @Override
    boolean isVulnerable() {
        return false;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

}

class Wizard extends Fighter {

    private boolean spellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter fighter) {
        if(spellPrepared){
            return 12;
        }
        else
            return 3;
    }

    void prepareSpell() {
        spellPrepared = true;
        setVulnerable(false);
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
