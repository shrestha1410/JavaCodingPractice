package org.example;

public class LinkListMain {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        Link link = linkList.insert(2);
        link = linkList.insertAtFirst(link, 3);
        link = linkList.insertAtFirst(link, 4);
        link = linkList.insertAtFirst(link, 5);
        link = linkList.insertAtFirst(link, 6);
        link = linkList.insertAtLast(link, 7);
        // linkList.display(link);
        // System.out.println("");
        // linkList.delete(link, 2);
        // linkList.display(link);
        // System.out.println("");
        // linkList.delete(link, 4);
        // linkList.display(link);

        // detect the loop in linklist
        System.out.println(linkList.detectloop(link));
    

    }
}
