package app.mazegame.system;

import app.mazegame.system.enums.Direction;

public class RoomBuilder {

    private Room room;

    public RoomBuilder(int roomNo){
        this.room = new Room(roomNo);
        this.room.setSide(Direction.NORTH,new Wall());
        this.room.setSide(Direction.WEST,new Wall());
        this.room.setSide(Direction.EAST,new Wall());
        this.room.setSide(Direction.SOUTH,new Wall());
    }

    public RoomBuilder setDoorWall(Direction direction,DoorWall doorWall){
        this.room.setSide(direction,doorWall);
        return this;
    }

    public Room build(){
        return room;
    }

}
