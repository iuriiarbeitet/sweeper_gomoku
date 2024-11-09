package org.example.impl;

import java.util.Objects;

import org.example.Cell;
import org.example.CellValue;
import org.example.GameTable;
import org.example.HumanTurn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DefaultHumanTurn implements HumanTurn {
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultHumanTurn.class); 
	private GameTable gameTable;
	
	@Override
	public void setGameTable(GameTable gameTable) {
		Objects.requireNonNull(gameTable, "Game table can't be null");
		this.gameTable = gameTable;
	}

	@Override
	public Cell makeTurn(int row, int col) {
		gameTable.setValue(row, col, CellValue.HUMAN);
		Cell cell = new Cell(row, col);
		LOGGER.info("Human turn is {}", cell);
		return cell;
	}
}
