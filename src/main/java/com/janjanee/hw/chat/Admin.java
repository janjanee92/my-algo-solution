package com.janjanee.hw.chat;

public class Admin {
    private Room room;

    public Admin(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void publicRoom() {
        room.setPublicRoom();
    }

    public void privateRoom(String password) {
        room.setPrivateRoom(password);
    }

    public void kickOutUser(User user) {
        checkAdminUser(user);
        room.removeUser(user);
    }

    public void stopTalkingUser(User user) {
        checkAdminUser(user);
        User findUser = room.findUser(user);
        findUser.noChatting();
    }

    private void checkAdminUser(User user) {
        if (user.getAdmin() != null && user.getAdmin() == this)
            throw new IllegalArgumentException(Message.ADMIN_NOT_APPLY);
    }

}
