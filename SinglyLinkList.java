import java.util.NoSuchElementException;

public class SinglyLinkList<E> {
    
    //CREATE HEAD & TAIL
    private ListNode<E> head;
    private ListNode<E> tail;
    private String namaList;

    //METHOD
    public SinglyLinkList(String namaList) {
        this.namaList = namaList;
        head = tail = null;
    }

    //EMPTY METHOD
    private boolean isEmpty() { 
        return head == null;
    }

    //INSERT FRONT METHOD
    public void insertFront(E insertItem){
        ListNode newNode = new ListNode(insertItem);
            if (head == null && tail == null) { 
                head = tail = new ListNode<E>(insertItem); 

            } else { 
                newNode.next = head;
                head = newNode; 
            }
    }

    //INSERT AT BACK METHOD
    public void insertAtBack(E insertItem) { 
        ListNode newNode = new ListNode(insertItem);
            if (isEmpty()) { 
                head = tail = new ListNode<E>(insertItem);
            } else { 
                tail.next = newNode;
                tail = newNode; 
            }
    }
        
    //REMOVE FROM BACK METHOD
    public E removeFromBack() throws NoSuchElementException { 
        if (isEmpty()) { 
            throw new NoSuchElementException(namaList + " is empty"); 
        }

        E removedItem = tail.data;

        if (head == tail) { 
            head = tail = null; 
        } else { 
            ListNode<E> current = head;
            while (current.next != tail) { 
                current = current.next;
            }
            tail = current; 

        }
        return removedItem; 
    }

    //REMOVE FROM FRONT METHOD
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { 
            throw new NoSuchElementException(namaList + " is empty"); 
        }

        E removedItem = head.data;

        if (head == tail) { 
            head = tail = null; 
        } else { 
            head = head.next; 
        }
        return removedItem; 
    }

    //PRINT METHOD    
    public void print() { 
        if (isEmpty()) {
            System.out.printf("Empty %s%n", namaList);
                return; 
        }

        System.out.printf("The %s is: %n", namaList);

        ListNode<E> current = head;

        while (current != null) { 
            System.out.printf("%s ", current.data); 
            current = current.next;
        }
        System.out.println();

    }
}
