package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class AllAwarding(
    @SerializedName("award_sub_type")
    val awardSubType: String? = null,
    @SerializedName("award_type")
    val awardType: String? = null,
    @SerializedName("awardings_required_to_grant_benefits")
    val awardingsRequiredToGrantBenefits: Any? = null,
    @SerializedName("coin_price")
    val coinPrice: Int? = null,
    @SerializedName("coin_reward")
    val coinReward: Int? = null,
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("days_of_drip_extension")
    val daysOfDripExtension: Int? = null,
    @SerializedName("days_of_premium")
    val daysOfPremium: Int? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("end_date")
    val endDate: Any? = null,
    @SerializedName("giver_coin_reward")
    val giverCoinReward: Any? = null,
    @SerializedName("icon_format")
    val iconFormat: String? = null,
    @SerializedName("icon_height")
    val iconHeight: Int? = null,
    @SerializedName("icon_url")
    val iconUrl: String? = null,
    @SerializedName("icon_width")
    val iconWidth: Int? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("is_enabled")
    val isEnabled: Boolean? = null,
    @SerializedName("is_new")
    val isNew: Boolean? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("penny_donate")
    val pennyDonate: Any? = null,
    @SerializedName("penny_price")
    val pennyPrice: Int? = null,
    @SerializedName("resized_icons")
    val resizedIcons: List<ResizedIcon?>? = null,
    @SerializedName("resized_static_icons")
    val resizedStaticIcons: List<ResizedStaticIcon?>? = null,
    @SerializedName("start_date")
    val startDate: Any? = null,
    @SerializedName("static_icon_height")
    val staticIconHeight: Int? = null,
    @SerializedName("static_icon_url")
    val staticIconUrl: String? = null,
    @SerializedName("static_icon_width")
    val staticIconWidth: Int? = null,
    @SerializedName("sticky_duration_seconds")
    val stickyDurationSeconds: Any? = null,
    @SerializedName("subreddit_coin_reward")
    val subredditCoinReward: Int? = null,
    @SerializedName("subreddit_id")
    val subredditId: Any? = null,
    @SerializedName("tiers_by_required_awardings")
    val tiersByRequiredAwardings: Any? = null
)