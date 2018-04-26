package com.tradesearch.domain;

import java.util.Date;


public class TradeSearch extends TradeSearchData{
    StringBuilder tradeRes= new StringBuilder();
    StringBuilder instRes = new StringBuilder();
    boolean noResults=true;
    public TradeSearch(){

    }
    public String GetTradeSearchResultsByDateRange(Date fromDate, Date toDate){
        tradeRes.append("Instrument wise traded volume details for date range :"+fromDate +" - " + toDate);
        Object[] tradeKeys = tradesList.keySet().toArray();

         for(Integer trade=0;trade<tradesList.size();trade++) {

                  if ((tradesList.get(tradeKeys[trade]).tradeDtTime.after(fromDate)
                       ||
                       tradesList.get(tradeKeys[trade]).tradeDtTime.equals(fromDate))
                       && ((tradesList.get(tradeKeys[trade]).tradeDtTime.before(toDate)
                       ||
                       tradesList.get(tradeKeys[trade]).tradeDtTime.equals(toDate))

                       )) {
                   tradeRes.append("\n");
                   tradeRes.append("S.nO: " + trade + 1 + "InstrumentID: "
                           + tradesList.get(tradeKeys[trade]).instId + " TradeId: " + tradesList.get(tradeKeys[trade]).tradeId);
               noResults=false;
                  }
               else if(noResults) {
                   instRes.append("\n");
                   instRes.append("No Records found. Please change the date range and try");
               }

           }


       return tradeRes.append(instRes.toString()).toString();
    }
    public String GetInstrumentResultsNotTradedByDateRange(Date fromDate, Date toDate){
        instRes.append("List of instrument not traded for date range : "+fromDate +" - " + toDate);
        Object[] tradeKeys = tradesList.keySet().toArray();
        Object[] instKeys = instrumentsList.keySet().toArray();
        for(Integer inst=0;inst<instrumentsList.size();inst++){

            for(Integer trade=0;trade<tradesList.size();trade++) {

                if (instrumentsList.get(instKeys[inst]).instId.equals(tradesList.get(tradeKeys[trade]).instId)
                        &&(tradesList.get(tradeKeys[trade]).tradeDtTime.after(fromDate)
                        ||
                        tradesList.get(tradeKeys[trade]).tradeDtTime.equals(fromDate))
                        && ((tradesList.get(tradeKeys[trade]).tradeDtTime.before(toDate)
                        ||
                        tradesList.get(tradeKeys[trade]).tradeDtTime.equals(toDate))

                )) {
                }
                else {
                    instRes.append("\n");
                    instRes.append("S.nO: " + inst + 1 + "InstrumentID: "
                            + instrumentsList.get(instKeys[inst]).instId + " InstrumentName: " + instrumentsList.get(instKeys[inst]).instName);
                }

            }
        }

        return tradeRes.append(instRes.toString()).toString();
    }

}

