package com.reachmobi.sportsdream.data

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


@Parcelize
data class Player(
@field:Json(name = "idPlayer")
    var idPlayer: String? = "",
    @field:Json(name = "strNationality")
    var strNationality: String? = "",
    @field:Json(name = "strPlayer")
    var strPlayer: String? = "",
    @field:Json(name = "strTeam")
    var strTeam: String? = "",
    @field:Json(name = "strTeam2")
    var strTeam2: String? = "",
    @field:Json(name = "strSport")
    var strSport: String? = "",
    @field:Json(name = "dateBorn")
    var dateBorn: String? = "",
    @field:Json(name = "strThumb")
    var strThumb: String? = "",
    @field:Json(name = "strCutout")
    var strCutout: String? = "",
    @field:Json(name = "strDescriptionEN")
    var strDescriptionEN: String? = ""
) : Parcelable {
//    constructor(parcel: Parcel) : this(
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString(),
//    parcel.readString()
//) {
//}
//
//    override fun describeContents(): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun writeToParcel(dest: Parcel, flags: Int) {
//        TODO("Not yet implemented")
//    }
//
//    companion object CREATOR : Parcelable.Creator<Player> {
//        override fun createFromParcel(parcel: Parcel): Player {
//            return Player(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Player?> {
//            return arrayOfNulls(size)
//        }
//    }
}
