package de.minestar.minestarlibrary.protocol;

import java.util.HashMap;
import java.util.Map;

public enum PacketType {
    MULTIPACKET,

    SERVERCHANGE_REQUEST,

    SERVERCHANGE_OK,

    SERVERCHANGE_DENY,

    DATA_SEND,

    DATA_REQUEST,

    DATA_OK,

    CHAT_MESSAGE,

    CHAT_DEATH,

    WHO_REQUEST,

    WHO_ANSWER,

    FREESLOTS_REQUEST,

    FREESLOTS_ANSWER;

    private static Map<Integer, PacketType> mapByOrdinal;

    static {
        mapByOrdinal = new HashMap<Integer, PacketType>();
        for (PacketType type : values()) {
            mapByOrdinal.put(type.ordinal(), type);
        }
    }

    public static PacketType get(int ordinal) {
        return mapByOrdinal.get(ordinal);
    }
}
