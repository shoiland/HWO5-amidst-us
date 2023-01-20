public class BlueAstronaut extends Player implements Crewmate {
    private int numTasks;
    private int taskSpeed;
    private boolean tasksDone;

    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }

    public BlueAstronaut(String name) {
        super(name, 15);
        this.numTasks = 6;
        this.taskSpeed = 10;
    }


    public void emergencyMeeting() {
        boolean isFroze = this.isFrozen();
        if (!isFroze) {
            Player[] players = Player.getPlayers();
            int highestSus = 0;
            int highestSusIndex = 0;
            for (int i = 0; i < players.length; i++) {
                if (!players[i].isFrozen() && players[i].getSusLevel() > highestSus) {
                    highestSus = players[i].getSusLevel();
                    highestSusIndex = i;
                }
            }
            int count = 0;
            for (int i = 0; i < players.length; i++) {
                if (players[i].getSusLevel() == highestSus) {
                    count++;
                }
            }
            if (count == 1) {
                players[highestSusIndex].setFrozen(true);
            }
            this.gameOver();
        }
    }

    public void completeTask() {
        if(!tasksDone){
            if(!this.isFrozen()){
                if(this.taskSpeed > 20){
                    this.numTasks -= 2;
                } else {
                    this.numTasks--;
                }
            }
            if(this.numTasks <= 0){
                this.tasksDone = true;
                System.out.println("I have completed all my tasks.");
                int susLevel = this.getSusLevel();
                susLevel = (int) (susLevel * (1-0.5));
                this.setSusLevel(susLevel);
            }
        }

    }

    public boolean equals(Player player){
        return super.equals(player) && (player.isFrozen() == this.isFrozen());
    }
    public String toString(){
        String newString = super.toString() + " I have " + this.numTasks + " left over.";
        if (this.getSusLevel() > 15){
            return newString.toUpperCase();
        }
        return newString;
    }
}
