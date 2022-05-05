package com.example.profitez;


import java.util.List;

public class parent_item {

    // Declaration of the variables
    private String ParentItemTitle;
    private List<Produit_Populaires> ChildItemList;

    // Constructor of the class
    // to initialize the variables
    public parent_item(
            String ParentItemTitle,
            List<Produit_Populaires> ChildItemList)
    {

        this.ParentItemTitle = ParentItemTitle;
        this.ChildItemList = ChildItemList;
    }

    // Getter and Setter methods
    // for each parameter
    public String getParentItemTitle()
    {
        return ParentItemTitle;
    }

    public void setParentItemTitle(
            String parentItemTitle)
    {
        ParentItemTitle = parentItemTitle;
    }

    public List<Produit_Populaires> getChildItemList()
    {
        return ChildItemList;
    }

    public void setChildItemList(
            List<Produit_Populaires> childItemList)
    {
        ChildItemList = childItemList;
    }
}

