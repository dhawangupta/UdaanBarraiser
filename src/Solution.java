import LocalMemory.LocalMemory;

import java.util.Scanner;

import static services.ClaimDeal.claimDealService;
import static services.CreateDeal.createDealService;
import static services.EndDeal.endDealService;
import static services.UpdateDeal.updateDealService;

public class Solution {
    public static void main (String[] args){
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);

        LocalMemory localMemory = new LocalMemory();

        System.out.println("to create deal enter - create, to claim enter - claim, to end enter - end, to update enter - update");

        while(true){
            String command = scanner.next();
            switch (command){
                case "create": createDealService(localMemory);
                    break;
                case "claim": claimDealService(localMemory);
                    break;
                case "end": endDealService(localMemory);
                    break;
                case "update": updateDealService(localMemory);
                    break;
                default:
                    break;
            }
        }


    }



}




/*

User -id,List<Deals>, noOfItemsRequired


Deal - id, itemId, startTime, endTime, noOfItemsRemainingToBeSold, price, sellerId

Seller - id

Item - id


 */