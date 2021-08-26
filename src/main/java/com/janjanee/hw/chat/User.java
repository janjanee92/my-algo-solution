package com.janjanee.hw.chat;

public class User {

    private String name;
    private Room inRoom;
    private boolean noChat;
    private Admin admin;

    public User(String name) {
        this.name = name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public boolean isNoChat() {
        return noChat;
    }

    public void noChatting() {
        noChat = true;
    }

    public Room createRoom(int id) {
        Room room = new Room(id);
        admin = new Admin(room);
        joinRoom(room);
        return room;
    }

    public void closeRoom() {
        if (admin == null) {
            throw new IllegalStateException(Message.USER_NOT_ADMIN_AUTHORITY);
        }
        inRoom.close();
        admin = null;
    }

    public void joinRoom(Room room) {
        room.checkClosed();
        room.checkPrivate();
        enter(room);
    }

    public void joinRoom(Room room, String password) {
        room.checkClosed();
        room.checkPassword(password);
        enter(room);
    }

    private void enter(Room room) {
        leaveRoom();
        inRoom = room;
        room.addUser(this);
    }

    public void leaveRoom() {
        if (inRoom != null) {
            inRoom.removeUser(this);
        }
    }

}
