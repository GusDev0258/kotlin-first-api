package udesc.eso.kotlin_backend_first_api.service

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import udesc.eso.kotlin_backend_first_api.entity.Message
import udesc.eso.kotlin_backend_first_api.repository.MessageRepository
import java.util.Optional
import java.util.UUID
import kotlin.jvm.optionals.toList

@Service
class MessageService (val db: MessageRepository){
//    fun findMessages(): List<Message> = db.query("select * from messages") { response, _ -> Message(response.getString("id"), response.getString("text"))}
//    fun findMessageById(id: String): List<Message> = db.query("select * from messages where id = ?", id) { response, _ ->
//        Message(response.getString("id"), response.getString("text"))
//    }
//    fun save(message: Message) {
//        val id = message.id ?: UUID.randomUUID().toString()
//        db.update("insert into messages values (?,?)",
//        id, message.text
//        )
//    }
    fun findMessages(): List<Message> = db.findAll().toList()
    fun findMessageById(id: String): List<Message> = db.findById(id).toList()
    fun save(message: Message) = db.save(message)

    fun <T: Any> Optional<out T>.toList(): List<T> = if (isPresent) listOf(get()) else emptyList()
}