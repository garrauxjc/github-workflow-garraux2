public class Store {

    // Num of each pet at the store
    public int catNum;
    public int dogNum;
    public int goatNum;


    Public getAvailPets{
        String curPets = "The pet store has " catNum + " cats, " + dogNum "dogs, and " + goatNum + "goats" ;

        return curPets;
    }



    // DOGS
    public void addDog() {
        dogNum++;
    }
    public void sellDog() {
        dogNum = dogNum-1;
    }
    public getDogNum(){
        return dogNum;
    }

    //////    CATS
    public void addCat() {
        catNum++;
    }
    public void sellCat() {
        catNum = catNum-1;
    }
    public getCatNum(){
        return catNum;
    }


    /////// GOATS
    public void addGoat() {
        goatNum++;
    }
    public void sellGoat() {
        goatNum = goatNum-1;
    }
    public getGoatNum(){
    return goatNum;
    }
}

