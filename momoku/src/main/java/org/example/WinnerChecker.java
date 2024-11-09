package org.example;


public interface WinnerChecker {
	
	void setGameTable(GameTable gameTable);

	WinnerResult isWinnerFound(CellValue cellValue);
}
