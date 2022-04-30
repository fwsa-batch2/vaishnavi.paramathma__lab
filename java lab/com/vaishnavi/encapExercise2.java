package com.vaishnavi;

public class encapExercise2 {
    private int ticketNo;
    private String movieName;

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public int getTicketNo() {
        return ticketNo;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public static void main(String[] args) {
        encapExercise2 myobj = new encapExercise2();
        myobj.setTicketNo(89);
        myobj.setMovieName("kgf");
        System.out.println(myobj.getTicketNo());
        System.out.println(myobj.getMovieName());
    }
}
