package com.lord_ukaka.musicapp.di

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.lord_ukaka.musicapp.R
import com.lord_ukaka.musicapp.adapters.SwipeSongAdapter
import com.lord_ukaka.musicapp.exoplayer.MusicServiceConnection
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMusicServiceConnection(
        app: Application,
    ) = MusicServiceConnection(app)

    @Singleton
    @Provides
    fun provideSwipeAdapter() = SwipeSongAdapter()

    @Provides
    @Singleton
    fun provideGlideInstance(
        app: Application
    ) = Glide
        .with(app)
        .setDefaultRequestOptions(
            RequestOptions()
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_image)
                .diskCacheStrategy(DiskCacheStrategy.DATA)
        )
}