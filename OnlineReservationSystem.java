class Ticket {
    int ticketId;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
        this.movieName = movieName;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class OnlineReservationSystem {
    private Ticket head = null, tail = null;

    public void bookTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
    }

    public void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        OnlineReservationSystem tr = new OnlineReservationSystem();
        tr.bookTicket(1, "gaurav", "Interstellar", "15", "2025-02-12");
        tr.bookTicket(2, "whoever", "Anyother", "5", "2025-02-13");
        tr.displayTickets();
    }
}