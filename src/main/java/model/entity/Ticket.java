package model.entity;

public class Ticket {
    private int idTicket;
    private int idSchedule;
    private int idUser;

    public Ticket(Builder builder) {
        this.idTicket = builder.idTicket;
        this.idSchedule = builder.idSchedule;
        this.idUser = builder.idUser;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public int getIdUser() {
        return idUser;
    }
    public static class Builder {
        private int idTicket = 0;
        private int idSchedule = 0;
        private int idUser = 0;

        public Builder setIdTicket(int idTicket) {
            this.idTicket = idTicket;
            return this;
        }

        public Builder setIdSchedule(int idSchedule) {
            this.idSchedule = idSchedule;
            return this;
        }

        public Builder setIdUser(int idUser) {
            this.idUser = idUser;
            return this;
        }

        public Ticket build(){
            return new Ticket(this);
        }
    }
}
