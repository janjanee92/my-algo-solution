package com.janjanee.hw.chat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatTest {

    @Test
    @DisplayName("대화방_생성")
    void create_room() {
        User user = new User("user1");
        Room room = user.createRoom(1);
        assertEquals(room.getUsers().get(0), user);
    }

    @Test
    @DisplayName("대화방_생성_방장확인")
    void create_room_admin() {
        User user = new User("user1");
        Room room = user.createRoom(1);

        Admin admin = user.getAdmin();
        assertEquals(admin.getRoom(), room);
    }

    @Test
    @DisplayName("대화방_종료")
    void close_room() {
        User user = new User("user1");
        Room room = user.createRoom(1);
        user.closeRoom();
        assertEquals(room.getUsers().size(), 0);
    }

    @Test
    @DisplayName("대화방_참여")
    void join_room() {
        User user = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        Room room = user.createRoom(1);

        user2.joinRoom(room);
        user3.joinRoom(room);

        assertEquals(room.getUsers().size(), 3);
    }

    @Test
    @DisplayName("대화방_나가기")
    void leave_room() {
        User user = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        Room room = user.createRoom(1);

        user2.joinRoom(room);
        user3.joinRoom(room);

        user3.leaveRoom();

        assertEquals(room.getUsers().size(), 2);
    }

    @Test
    @DisplayName("방장_방 공개")
    void public_room() {
        User user = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        Room room = user.createRoom(1);
        Admin admin = user.getAdmin();

        admin.publicRoom();

        user2.joinRoom(room);
        user3.joinRoom(room);

        assertEquals(room.getUsers().size(), 3);
    }

    @Test
    @DisplayName("방장_방 비공개")
    void private_room() {
        User user = new User("user1");
        User user2 = new User("user2");

        Room room = user.createRoom(1);
        Admin admin = user.getAdmin();

        admin.privateRoom("12345");

        assertThrows(IllegalStateException.class, () -> user2.joinRoom(room));
        user2.joinRoom(room, "12345");
        assertEquals(room.getUsers().size(), 2);
    }

    @Test
    @DisplayName("방장_내보내기")
    void kick_out_user() {
        User user = new User("user1");
        User user2 = new User("user2");

        Room room = user.createRoom(1);
        Admin admin = user.getAdmin();

        user2.joinRoom(room);

        admin.kickOutUser(user2);
        assertEquals(room.getUsers().size(), 1);
    }

    @Test
    @DisplayName("방장_채팅금지")
    void no_chat_user() {
        User user = new User("user1");
        User user2 = new User("user2");

        Room room = user.createRoom(1);
        Admin admin = user.getAdmin();

        user2.joinRoom(room);

        admin.stopTalkingUser(user2);
        assertTrue(room.getUsers().get(1).isNoChat());
    }

}
