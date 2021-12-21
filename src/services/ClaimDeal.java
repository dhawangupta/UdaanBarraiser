package services;

import LocalMemory.LocalMemory;
import entities.Deal;
import entities.User;

import java.util.Scanner;

public class ClaimDeal {
    public static void claimDeal(LocalMemory localMemory, String dealid, String userid){
        for(Deal deal : localMemory.dealList){
            if(deal.id.equals(dealid)) {
                for(User user : localMemory.userList){
                    if(user.id == userid){
                        long currentTimeMillis = System.currentTimeMillis();
                        if(currentTimeMillis>deal.endTime){
                            System.out.println("deal expired");
                        }else if(user.dealList.contains(deal)){
                            System.out.println("deal claimed already");
                        } else if (deal.noOfItemsRemainingToBeSold > 0){
                            user.dealList.add(deal);
                            deal.noOfItemsRemainingToBeSold = deal.noOfItemsRemainingToBeSold-1;


                            System.out.println("deal claimed successfully");
                        } else {
                            System.out.println("deal claims exhausted");
                        }
                    }
                }

                break;
            }
        }
    }

    public static void claimDealService(LocalMemory localMemory){
        System.out.println("enter dealid, userid");
        Scanner scanner = new Scanner(System.in);
        claimDeal(localMemory, scanner.next(), scanner.next());
    }
}
