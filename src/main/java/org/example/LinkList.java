package org.example;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link insert(int data) {
        if (first == null) {
            Link link = null;
            // insert first
            link = new Link(data);
            link.next = first;
            first = link;
            return link;
        }
        return null;
    }

    public Link insertAtFirst(Link link, int data) {
        if (link == null) {
            System.out.println("Link list is null");
        } else {
            Link linknew = new Link(data);
            linknew.next = link;
            first = linknew;
            return linknew;
        }
        return null;
    }

    public Link insertAtLast(Link link, int data) {
        if (link == null) {
            link = new Link(data);
            link.next = null;
            first = link;
            return link;
        } else {
            Link current = link;
            while (current.next != null) {
                current = current.next;
            }
            Link linknew = new Link(data);
            // linknew.next=null;
            linknew.next = current;
            current.next = linknew;
            return link;
        }
    }

    public void display(Link link) {
        Link current = first;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data);
            } else {
                System.out.print(current.data + "->");
            }
            current = current.next;
        }
    }

    public void delete(Link link, int data) {
        if (link == null) {
            System.out.println("linklist is null");
        } else {
            Link current = link;
            Link previous = null;
            while (current.next != null) {
                if (current.data == data) {
                    previous.next = current.next;
                }
                previous = current;
                current = current.next;
            }

        }
    }

    public Boolean detectloop(Link link) {
        Link last = link;
        Link first = link;
        while (first != null && last.next!=null) {
            last=last.next.next;
            first=first.next;
            if(last==first){
                return true;
            }
        }

        return false;
    }

}
