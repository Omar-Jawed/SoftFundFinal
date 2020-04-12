package ca.sheridancollege.project;

public class NumberCards {
	public enum Color {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }

    public enum Value {
        ZERO    { public String toString() { return "0";}},
        ONE     { public String toString() { return "1";}},
        TWO     { public String toString() { return "2";}},
        THREE   { public String toString() { return "3";}},
        FOUR    { public String toString() { return "4";}},
        FIVE    { public String toString() { return "5";}},
        SIX     { public String toString() { return "6";}},
        SEVEN   { public String toString() { return "7";}},
        EIGHT   { public String toString() { return "8";}},
        NINE    { public String toString() { return "9";}}
    }
    
    public enum Special {
        SKIP    { public String toString() { return "SKIP";}},
        REVERSE { public String toString() { return "REVERSE";}},
        DRAWTWO { public String toString() { return "+2";}}
    }

    public void EspecialCard(Color color, Special special){
        this.color = color;
        this.special = special;
    }

    private Color color;
    private Value value;
    private Special special;

    public void NormalCard(final Color color, final Value value){
        this.color = color;
        this.value = value;
    }
    
    public String getColor(){
    	return this.color.name();
    }
    
    public String getValue(){
    	return this.value.toString();
    }
    
	public String getSpecial() {
		return this.special.toString();
	}
}