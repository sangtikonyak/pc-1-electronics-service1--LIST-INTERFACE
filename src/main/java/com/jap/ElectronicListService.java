package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String[] split = electronicsItems.split(",");
        // itemList=Arrays.asList(split);
        for (String s : split) {
            if (!itemList.contains(s)) {
                itemList.add(s);
            }
        }
        System.out.println("itemList = " + itemList);
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        int index=0;

        for (int i=0;i<itemList.size();i++)
        {
            if (itemList.contains(searchItem))
            {
                index= itemList.indexOf(searchItem);
            }

        }
        System.out.println(index);
        return index;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        for(int i=0;i<itemList.size();i++)
        {
            if (itemList.get(i).contains(removeItem))
            {
                itemList.remove(itemList.get(i));
                flag=true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        List<String>electronicItems=addElectronicsItemsToList("laptop,grid,pie,pie");

        // System.out.println("electronicItems.size() = " + electronicItems.size());
        System.out.println("removeElectronicsItemFromList(electronicItems,\"pie\") = " + removeElectronicsItemFromList(electronicItems, "pie"));
    }

}
