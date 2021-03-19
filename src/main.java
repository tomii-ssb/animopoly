public class main {
    public static void main(String[] args) {
        Animal animals[] = new Animal[14];
        animals[0] = new Animal("Giraffe", 200, 1,0);
        animals[1] = new Animal("Gorilla,Gorilla,Gorilla", 0, 2,0);
        animals[2] = new Animal("Japanese Spider Crab", 1500, 3,0);
        animals[3] = new Animal("Peacock Shrimp", 1200, 4,0);
        animals[4] = new Animal("Seal", 3000, 5,0);
        animals[5] = new Animal("Hellbender", 1769, 6,0);
        animals[6] = new Animal("Erkling", 5000, 7,0);
        animals[7] = new Animal("Shoebill", 800, 8,0);
        animals[8] = new Animal("Blobfish", 3000, 9,0);
        animals[9] = new Animal("Star-Nosed Mole", 2700, 10,0);
        animals[10] = new Animal("Orangutang", 3000, 11,0);
        animals[11] = new Animal("Racoon", 3000, 12,0);
        animals[12] = new Animal("Proboscis Monkey", 500, 13,0);
        animals[13] = new Animal("CBEAST", 7000, 14,0);
// add upgrading method if the user selects to upgrade their animal.
    }
    getPlayer_num(){
        //this is declared in the player class jonathan made and will need to be combined for
        //it to not show up as an error.
        int currentPlayer;
    }
    //again
    // each time player steps on tile with animal on it:
    Animal CurrentAnimal = animals[currentPlayer.getpos()];
    CurrentAnimal.upgrade();
    public void upgrade(){
   if(level > 3){
       System.out.print("This animal is already maxed out!");
      // return also wont work as code isnt full combined yet however it will return to the GUI options when code complete.
       return;
   }else{
       level++;
   }

    }
    public int payup(){
// if upgrade bla bla then pay bla bla

    }
}
