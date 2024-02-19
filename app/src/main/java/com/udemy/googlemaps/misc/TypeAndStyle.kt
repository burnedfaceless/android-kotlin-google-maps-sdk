package com.udemy.googlemaps.misc

import android.view.MenuItem
import com.google.android.gms.maps.GoogleMap
import com.udemy.googlemaps.R

class TypeAndStyle {

    fun setMapType(item: MenuItem, mMap: GoogleMap) {
        when (item.itemId) {
            R.id.normal_map -> {
                mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            }
            R.id.hybrid_map -> {
                mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
            }
            R.id.satellite_map -> {
                mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
            }
            R.id.terrian_map -> {
                mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
            }
            R.id.none_map -> {
                mMap.mapType = GoogleMap.MAP_TYPE_NONE
            }
        }
    }
}