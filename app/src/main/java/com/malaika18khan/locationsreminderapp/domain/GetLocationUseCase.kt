package com.malaika18khan.locationsreminderapp.domain

import android.os.Build
import androidx.annotation.RequiresApi
import com.google.android.gms.maps.model.LatLng
import com.malaika18khan.locationsreminderapp.data.ILocationService
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetLocationUseCase @Inject constructor(
    private val locationService: ILocationService
) {
    @RequiresApi(Build.VERSION_CODES.S)
    operator fun invoke(): Flow<LatLng?> = locationService.requestLocationUpdates()

}