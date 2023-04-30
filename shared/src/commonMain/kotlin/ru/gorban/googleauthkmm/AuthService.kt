package ru.gorban.googleauthkmm

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.GoogleAuthProvider
import dev.gitlive.firebase.auth.auth

class AuthService {

    suspend fun authWithGoogle(idToken: String) {
        val cr = GoogleAuthProvider.credential(idToken, null)
        val result = Firebase.auth.signInWithCredential(cr)
        // you can get user {result.user}
    }

    suspend fun signOut() {
        Firebase.auth.signOut()
    }

}