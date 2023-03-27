public class Person {
    protected String name;
    protected String lastName;
    protected int tickets;

    public Person(String name, String lastName, int tickets) {
        this.name = name;
        this.lastName = lastName;
        if (tickets > 0) {
            this.tickets = tickets;
        } else {
            this.tickets = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTickets() {
        return tickets;
    }

    public void useTicket() {
        if (getTickets() > 0) {
            this.tickets = getTickets() - 1;
        }
    }
}
