package com.samsmndebele.firebase

import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.firestore.Firestore
import com.google.cloud.storage.Bucket
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.cloud.FirestoreClient
import com.google.firebase.cloud.StorageClient
import com.google.firebase.database.FirebaseDatabase
import java.io.FileInputStream
import java.io.InputStream

@Suppress("MemberVisibilityCanBePrivate")
object Firebase {
//    const val BUCKET_NAME = "studentintellect-co-za.firebasestorage.app"
//    const val DATABASE_URL = "https://studentintellect-co-za-default-rtdb.asia-southeast1.firebasedatabase.app"

    private val adminFileStream: InputStream = FileInputStream("etc/secrets/firebase-admin-sdk.json")
    private val credentials = GoogleCredentials.fromStream(adminFileStream)
    private val firebaseOptions = FirebaseOptions.builder()
        .setCredentials(credentials)
//        .setStorageBucket(BUCKET_NAME)
//        .setDatabaseUrl(DATABASE_URL)
        .build()

    val app: FirebaseApp by lazy { FirebaseApp.initializeApp(firebaseOptions) }

    val auth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance(app)
    }
    val firestore: Firestore by lazy {
        FirestoreClient.getFirestore(app)
    }
//    val database: FirebaseDatabase by lazy {
//        FirebaseDatabase.getInstance(app)
//    }
//    val bucket: Bucket by lazy {
//        StorageClient.getInstance(app).bucket()
//    }
}