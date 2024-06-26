package com.example.finebyme.utils

import android.content.Context
import android.content.Intent
import com.example.finebyme.data.db.Photo
import com.example.finebyme.ui.photoDetail.PhotoDetailActivity

object IntentUtils {
    private const val ARG_PHOTO = "photo"
    fun newPhotoDetail(context: Context, photo: Photo): Intent {
        return Intent(context, PhotoDetailActivity::class.java).apply {
            putExtra(ARG_PHOTO, photo)
        }
    }
}