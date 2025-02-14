import java.util.Arrays;

class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private pet pet;
    static {
        System.out.println("Family class is loaded.");
    }
    {
        System.out.println("A new family object is created.");
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = new pet();
        this.father.setFamily(this);
        this.mother.setFamily(this);
    }
    public Human getMother() {
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public pet getPet(){
        return pet;
    }
    public void setPet(pet pet){
        this.pet = pet;
    }
    public void addchild(Human child){
        Human [] child1 = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            child1[i] = children[i];
        }
        child1[children.length] = child;
        children = child1;
        child.setFamily(this);
    }
    public void removeChild(Human child){
         int counter = 0;
        Human [] child1 = new Human[children.length - 1];
        for (int j = 0; j < children.length; j++) {
            if (!children[j].equals(child)) {
                child1[counter] = children[j];
                counter++;
            }
        }
        children = child1;
        child.setFamily(null);
    }
    public int Memmebersoffamily(){
        return children.length +2;
    }
    @Override
    public String toString() {
        return "Family = mother:"+ mother.toString() +"\nfather:"+ father.toString() + "\nchildren:" + Arrays.toString(children) + "\npet:" + pet.toString();
    }
}
