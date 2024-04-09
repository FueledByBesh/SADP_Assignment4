package app.mazegame.system;

import app.mazegame.system.enums.Direction;

public class MazeGame {

    public Maze createMaze () {

        DoorWall d = new DoorWall();

        Room r1 = new RoomBuilder(1).setDoorWall(Direction.NORTH,d).build();
        Room r2 = new RoomBuilder(2).setDoorWall(Direction.SOUTH,d).build();

        Maze maze = new MazeBuilder().addRoom(r1).addRoom(r2).build();

        return maze ;
    }
}