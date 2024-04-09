package app.mazegame.system;

public class DoorWall extends Wall {

    private boolean isOpen;

    public DoorWall () {
        this.isOpen = false;
    }

    public void openDoor(){
        this.isOpen = true;
    }

    public void closeDoor(){
        this.isOpen = false;
    }


}
