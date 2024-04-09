package app.mazegame.system;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private final Map<Integer, Room> rooms;

    public Maze(){
        rooms = new HashMap<Integer, Room>();
    }

    public void addRoom (Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room getRoom (int r) {
        return rooms.get (r);
    }
}
