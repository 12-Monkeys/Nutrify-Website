package models;

import java.util.HashSet;
import java.util.Set;

public class Diet {
	public Long dietid;
    public String name;
    public Integer value;
    private static Set<Diet> diets;
    static {
        diets = new HashSet<Diet>();
        diets.add(new Diet(1L, "Végétarien", 0)); // OK pour Végétarien
        diets.add(new Diet(2L, "Végétalien", 0)); // OK régime Végétalien
        diets.add(new Diet(3L, "Végétalien", 1)); // OK régime végétalien modéré
        diets.add(new Diet(4L, "Végétalien", 2)); // KO régime végétalien strict
        diets.add(new Diet(5L, "Halal", null)); // Pas de données sur régime Halal
    }
    public Diet() {}
	public Diet(Long dietid, String name, Integer value) {
		this.dietid = dietid;
		this.name = name;
		this.value = value;
	}
}
