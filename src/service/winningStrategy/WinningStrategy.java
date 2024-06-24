package service.winningStrategy;

import model.Move;
import model.Player;
import model.Board;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
