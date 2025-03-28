package uz.jahonov.opensettings

import android.content.Intent
import android.service.quicksettings.TileService

class MyTileService : TileService() {

    // Called when the user adds your tile.
    override fun onTileAdded() {
        super.onTileAdded()
    }

    // Called when your app can update your tile.
    override fun onStartListening() {
        super.onStartListening()
    }

    // Called when your app can no longer update your tile.
    override fun onStopListening() {
        super.onStopListening()
    }

    // Called when the user taps on your tile in an active or inactive state.
    override fun onClick() {
        val launchIntent = packageManager.getLaunchIntentForPackage(packageName)
        launchIntent?.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(launchIntent)
    }

    // Called when the user removes your tile.
    override fun onTileRemoved() {
        super.onTileRemoved()
    }
}