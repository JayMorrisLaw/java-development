package com.pluralsight;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    public void checkIn_IfNotOccupiedAndIsDirty_SetBothToTrue(){
        // arrange
        Room room = new Room(1, 200);

        //act
        room.CheckIn();

        // assert
        



    }
    @Test
    public void checkout(){

    }
    @Test
    public void cleanRoom(){

    }


}
