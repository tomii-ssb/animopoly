public class Animal {
    String name;
    int level;
    int cost;
    boolean owned;
    int pos;
    int upgrade;
    public int getUpgrade() {
        return upgrade;
    }
    public void setUpgrade(int upgrade) {
        this.upgrade = upgrade;
    }
    public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }
    public Animal(String name, int cost,int pos,int upgrade) {
        this.name = name;
        this.cost = cost;
        this.upgrade = upgrade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public boolean isOwned() {
        return owned;
    }
    public void setOwned(boolean owned) {
        this.owned = owned;
    }

}
