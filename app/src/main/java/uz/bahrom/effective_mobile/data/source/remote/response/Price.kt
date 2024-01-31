package uz.bahrom.effective_mobile.data.source.remote.response

data class Price(
    val discount: Int,
    val price: String,
    val priceWithDiscount: String,
    val unit: String
)