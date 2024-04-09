package app.mazegame.appinterface;

import app.mazegame.system.MazeGame;

public class GameInterface {
    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze();
    }
}
