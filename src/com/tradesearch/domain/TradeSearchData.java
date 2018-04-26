package com.tradesearch.domain;

import com.tradesearch.domain.Instruments;
import com.tradesearch.domain.Trades;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class TradeSearchData {

    public HashMap<String,Trades> tradesList = new  HashMap<String,Trades>();

    public HashMap<String,Instruments> instrumentsList = new HashMap<String,Instruments>();

    public TradeSearchData(){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Scanner readTradeList = new Scanner(new File("./src/com/tradesearch/trades.txt"));
            readTradeList.useDelimiter(",");

            Scanner readInstrumentList = new Scanner(new File("./src/com/tradesearch/inst.txt"));
            readInstrumentList.useDelimiter(",");

            readTradeList.nextLine();
            while (readTradeList.hasNext()){
                String line = readTradeList.nextLine();
                String[] details = line.split(",");
                Trades trade = new Trades();
                trade.tradeId = (String) details[0];
                trade.tradeDtTime = dateFormat.parse(details[1]);
                trade.instId = (String) details[2];
                trade.qty = Integer.parseInt( details[3]);
                trade.price = Double.parseDouble( details[4]);
                trade.amount = Double.parseDouble(details[5]);
                trade.trader = (String) details[6];
                tradesList.put(trade.tradeId,trade);
            }
            readInstrumentList.nextLine();
            while (readInstrumentList.hasNext()){
                String line = readInstrumentList.nextLine();
                String[] details = line.split(",");
                Instruments instrument = new Instruments();
                instrument.instId = details[0];
                instrument.instName = details[1];
                instrumentsList.put(instrument.instId,instrument);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
