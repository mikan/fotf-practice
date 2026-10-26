package io.github.mikan.fotf.examples.cha;

/**
 * p362 A.1 起源
 */
public class Game {
    private final int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        // rolls からスコアを計算するロジック
        throw new UnsupportedOperationException("Not implemented yet");
    }

    static void main() {
        Game game = new Game();
        game.roll(10);
    }
}
