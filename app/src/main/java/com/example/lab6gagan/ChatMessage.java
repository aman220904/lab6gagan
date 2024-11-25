
package com.example.lab6gagan;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import androidx.room.Entity;


@Entity
public class ChatMessage {

    @ColumnInfo(name = "message_text")
    public String messageText;

    @ColumnInfo(name = "timestamp")
    public long timestamp;

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "receive_message")
    public boolean receiveMessage;

    // Constructor
    public ChatMessage(String messageText, long timestamp, boolean receiveMessage) {
        this.messageText = messageText;
        this.timestamp = timestamp;
        this.receiveMessage = receiveMessage;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getMessageText() { return messageText; }
    public long getTimestamp() { return timestamp; }
    public boolean isReceiveMessage() { return receiveMessage; }
}
