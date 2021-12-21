package services;

import LocalMemory.LocalMemory;
import entities.Deal;

import java.util.Locale;
import java.util.Scanner;


public class CreateDeal {

    public static String createDeal(LocalMemory localMemory, Double price, Integer noOfItems, String itemId, Long startTime, Long endTime){
        Deal deal = new Deal(price, noOfItems, itemId, startTime, endTime);
        System.out.println("Deal created");
        localMemory.dealList.add(deal);
        return deal.id;
    }

    public static void createDealService(LocalMemory localMemory){
        System.out.println("curernt Time "+ System.currentTimeMillis());
        System.out.println("enter price, noOfItems, itemId, startTime, endTime with space separated");
        Scanner scanner = new Scanner(System.in);
        String dealId = createDeal(localMemory, scanner.nextDouble(),scanner.nextInt(), scanner.next(),
                scanner.nextLong(), scanner.nextLong());
        System.out.println("Dealid "+dealId);
    }
}
