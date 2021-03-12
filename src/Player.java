public class Player {

    private int currentSquare;
    private int player_num;
    private int balance = 2000;

    public int getPlayer_num() {
        return player_num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(int currentSquare) {
        this.currentSquare = currentSquare;
    }

    public void Move(int steps)
    {
        System.out.println("Current currentSquare " + currentSquare);
        currentSquare=currentSquare+steps;
        System.out.println("New currentSquare " + currentSquare);

    }
}