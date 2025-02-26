package com.samsmndebele.services

import com.samsmndebele.utils.dbQuery
import com.samsmndebele.utils.query
import com.samsmndebele.utils.querySingle
import com.samsmndebele.utils.update
import kotlinx.coroutines.*
import kotlinx.serialization.Serializable
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

@Serializable
data class Contact(
    val id: Int = 0,
    val name: String,
    val email: String,
    val phone: String?,
    val message: String
)
object ContactService {
    private const val CREATE_TABLE_CONTACTS = """
            CREATE TABLE contacts(
                id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY, 
                name VARCHAR(64) NOT NULL, 
                email VARCHAR(64) NOT NULL,
                phone VARCHAR(16) DEFAULT NULL,
                message TEXT NOT NULL,
                unique (email, message)
            );
            """
    private const val INSERT_CONTACT = "INSERT INTO contacts(name, email, phone, message) VALUES (?, ?, ?, ?);"
    private const val SELECT_CONTACT_BY_ID = "SELECT * FROM contacts WHERE id = ?;"
    private const val SELECT_CONTACT = "SELECT * FROM contacts;"
    private const val DELETE_CONTACT = "DELETE FROM contacts WHERE id = ?;"

    private fun ResultSet.getContact() = Contact(
        id = getInt("id"),
        name = getString("name"),
        email = getString("email"),
        phone = getString("phone"),
        message = getString("message")
    )

    init {
        runBlocking {
            try {
                dbQuery {
                    update(CREATE_TABLE_CONTACTS)
                }
            } catch (_: Exception) {}
        }
    }

    // Create new contact
    suspend fun create(contact: Contact): Unit = dbQuery {
        update(INSERT_CONTACT) {
            setString(1, contact.name)
            setString(2, contact.email)
            setString(3, contact.phone)
            setString(4, contact.message)
        }
    }

    // Read a contact
    suspend fun read(id: Int): Contact = dbQuery {
        querySingle(SELECT_CONTACT_BY_ID, { getContact() }) {
            setInt(1, id)
        }
    }
    suspend fun read(): List<Contact> = dbQuery {
        query(SELECT_CONTACT, { getContact() })
    }

    // Delete a contact
    suspend fun delete(id: Int): Unit = dbQuery {
        update(DELETE_CONTACT) {
            setInt(1, id)
        }
    }
}

