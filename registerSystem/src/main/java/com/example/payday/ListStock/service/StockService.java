package com.example.payday.ListStock.service;

import com.example.payday.ListStock.Dto.FigiesDto;
import com.example.payday.ListStock.Dto.StocksDto;
import com.example.payday.ListStock.Dto.StocksPricesDto;
import com.example.payday.ListStock.Dto.TickersDto;
import com.example.payday.ListStock.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
    StocksPricesDto getPricesStocksByFigies(FigiesDto figiesDto);

    StocksDto getStocksByTickers(TickersDto tickers);
}
