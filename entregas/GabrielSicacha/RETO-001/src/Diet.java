import java.util.Scanner;

public class Diet {
    DayNode first;

    public Diet() {
        this.first = null;
    }

    public DayNode getFirst() {
        return first;
    }

    public void setFirst(DayNode first) {
        this.first = first;
    }

    public void addDay(Day day){
        DayNode newDayNode = new DayNode(day);
        if (first == null) {
            first = newDayNode;
        } else {
            DayNode current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newDayNode);
        }
    }

    public void deleteDay(String date){
        DayNode iterator=this.first;
        while ((iterator.getNext().getDay()!=null)||(iterator.getNext().getDay().getDate().equals(date))){
            iterator=iterator.getNext();
        }
        if (iterator.getDay()!=null){
            iterator.setNext(iterator.getNext().getNext());
        }
    }

    public void editDay(String date){
        DayNode iterator=this.first;
        while ((iterator.getNext().getDay()!=null)||(iterator.getNext().getDay().getDate().equals(date))){
            iterator=iterator.getNext();
        }
        if (iterator.getDay()!=null){
            Scanner scanner = new Scanner(System.in);
            String newDate = scanner.nextLine();
            iterator.getDay().setDate(newDate);
        }
    }
}
