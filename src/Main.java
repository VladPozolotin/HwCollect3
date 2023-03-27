import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while(!queue.isEmpty()) {
            Person passenger = queue.poll();
            passenger.useTicket();
            System.out.println(passenger.getName() + " " + passenger.getLastName() + " прокатился на аттракционе.");
            if (passenger.getTickets() > 0) {
                queue.offer(passenger);
            }
        }
    }
    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Рулон","Обоев", 3));
        clients.add(new Person("Подрыв","Устоев", 1));
        clients.add(new Person("Обвал","Забоев", 2));
        clients.add(new Person("Проспект","Героев", 6));
        clients.add(new Person("Разбор","Полётов", 4));
        clients.add(new Person("Учёт","Доходов", 5));
        return clients;
    }
}