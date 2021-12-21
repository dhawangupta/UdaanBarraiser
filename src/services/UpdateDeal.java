package services;

import LocalMemory.LocalMemory;
import entities.Deal;

import java.util.Scanner;

public class UpdateDeal {
    public static void endDeal(LocalMemory localMemory, String dealid, Integer numberOfItemsToBeIncreased, Long endTime){
        for(Deal deal : localMemory.dealList){
            if(deal.id.equals(dealid)) {
                deal.noOfItemsRemainingToBeSold = deal.noOfItemsRemainingToBeSold+numberOfItemsToBeIncreased;
                deal.endTime = endTime;
                break;
            }
        }
        System.out.println("deal updated "+dealid);
    }

    public static void updateDealService(LocalMemory localMemory){
        System.out.println("enter dealid, numberOfItemsToBeIncreased, endTime ");
        Scanner scanner = new Scanner(System.in);
        endDeal(localMemory, scanner.next(), scanner.nextInt(), scanner.nextLong());
    }
}
