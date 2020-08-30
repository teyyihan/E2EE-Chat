package com.teyyihan.data.local.implementation

import com.teyyihan.data.local.abstraction.MessageLocalDataSource
import com.teyyihan.data.model.entity.Message

/**
 *  This is the REAL implementation of messages
 */

class MessageLocalDataSourceImpl(
    private val messageDao: MessageDao
) : MessageLocalDataSource
{
    override suspend fun insertMessage(message: Message): Long =
        messageDao.insertMessage(message)

    override suspend fun getMessage(messageID: Int): Message? =
        messageDao.getMessage(messageID)
}