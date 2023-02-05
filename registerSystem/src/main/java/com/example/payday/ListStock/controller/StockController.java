package com.example.payday.ListStock.controller;

import com.example.payday.ListStock.Dto.FigiesDto;
import com.example.payday.ListStock.Dto.StocksDto;
import com.example.payday.ListStock.Dto.StocksPricesDto;
import com.example.payday.ListStock.Dto.TickersDto;
import com.example.payday.ListStock.model.Stock;
import com.example.payday.ListStock.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {
    private  StockService stockService;
    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    //controller
    @PostMapping("/prices")
    public StocksPricesDto getPricesStocksByFigies(@RequestBody FigiesDto figiesDto) {
        return stockService.getPricesStocksByFigies(figiesDto);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickers) {
        return stockService.getStocksByTickers(tickers);
    }
}
