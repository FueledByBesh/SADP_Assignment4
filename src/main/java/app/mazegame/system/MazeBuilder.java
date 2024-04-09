package app.mazegame.system;

public class MazeBuilder {

    private Maze maze;

    public MazeBuilder(){
        this.maze = new Maze();
    }

    public MazeBuilder addRoom(Room room){
        this.maze.addRoom(room);
        return this;
    }

    public Maze build(){
        return maze;
    }

}
