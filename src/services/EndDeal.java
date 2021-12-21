package services;

import LocalMemory.LocalMemory;
import entities.Deal;

import java.util.Scanner;

public class EndDeal {
    public static void endDeal(LocalMemory localMemory, String dealid){
        for(Deal deal : localMemory.dealList){
            if(deal.id.equals(dealid)) {
                localMemory.dealList.remove(deal);
                break;
            }
        }
        System.out.println("deal ended "+dealid);
    }

    public static void endDealService(LocalMemory localMemory){
        System.out.println("enter dealid");
        Scanner scanner = new Scanner(System.in);
        endDeal(localMemory, scanner.next());
    }
}
