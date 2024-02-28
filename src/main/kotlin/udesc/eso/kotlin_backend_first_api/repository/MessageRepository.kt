package udesc.eso.kotlin_backend_first_api.repository

import org.springframework.data.repository.CrudRepository
import udesc.eso.kotlin_backend_first_api.entity.Message

interface MessageRepository: CrudRepository<Message, String> {
}