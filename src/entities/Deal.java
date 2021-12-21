package entities;

import java.text.DateFormat;
import java.util.*;

public class Deal {
    public String id;
    public String itemId;
    public String sellerId;
    public Long  startTime;
    public Long endTime;
    public Integer noOfItemsRemainingToBeSold;
    public Double price;

    public Deal(Double price, Integer noOfItemsRemainingToBeSold, String itemId, Long startTime, Long endTime){
        this.price = price;
        this.noOfItemsRemainingToBeSold = noOfItemsRemainingToBeSold;
        this.itemId = itemId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.id = UUID.randomUUID().toString();
    }
}

/*

User -id,List<Deals>, noOfItemsRequired


Deal - id, itemId, startTime, endTime, noOfItemsRemainingToBeSold, price, sellerId

Seller - id

Item - id


 */