package com.janjanee.hw.chat;

import java.util.ArrayList;
import java.util.List;

import static com.janjanee.hw.chat.Message.*;

public class Room {

    private int id;
    private List<User> users = new ArrayList<>();
    private boolean privateRoom;
    private boolean closed;
    private String password;

    public boolean isPrivateRoom() {
        return privateRoom;
    }

    public boolean isClosed() {
        return closed;
    }

    public List<User> getUsers() {
        return users;
    }

    public Room(int id) {
        this.id = id;
    }

    public void setPublicRoom() {
        privateRoom = false;
        password = "";
    }

    public void setPrivateRoom(String password) {
        privateRoom = true;
        this.password = password;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void close() {
        users.clear();
        closed = true;
    }

    public void removeUser(User user) {
        if(!users.remove(user))
            throw new IllegalStateException(USER_NOT_FOUND);
    }

    public User findUser(User user) {
        int idx = users.indexOf(user);
        if (idx == -1) {
            throw new IllegalStateException(USER_NOT_FOUND);
        } else {
            return users.get(idx);
        }
    }

    public void checkClosed() {
        if(isClosed())
            throw new IllegalStateException(ROOM_IS_CLOSED);
    }

    public void checkPrivate() {
        if(isPrivateRoom()) {
            throw new IllegalStateException(ROOM_IS_PRIVATE);
        }
    }

    public void checkPassword(String password) {
        if (!this.password.equals(password)) {
            throw new IllegalArgumentException(PASSWORD_NOT_MATCH);
        }
    }

}
