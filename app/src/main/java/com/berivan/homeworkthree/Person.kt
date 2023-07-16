import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize

data class Person(
  val adisoyadi: String,
  val email: String,
  val cinsiyet: String,
  val sehir:String
) : Parcelable






