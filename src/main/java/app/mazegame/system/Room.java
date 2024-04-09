package app.mazegame.system;

import app.mazegame.system.enums.Direction;

import java.util.HashMap;
import java.util.Map;

public class Room implements Prototype{
    private Map<Direction, Wall> sides = new HashMap<Direction, Wall>();
    private int roomNo;

    public Room (int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide (Direction direction) {
        return sides.get(direction);
    }

    public void setSide (Direction direction , Wall wall) {
        sides.put(direction, wall );
    }

    public int getRoomNo(){
        return roomNo;
    }


    @Override
    public Room clone() {
        Room room = new Room(this.roomNo);
        for (Direction direction: sides.keySet().stream().toList()) {
            room.setSide(direction,sides.get(direction));
        }
        return room;
    }
}
