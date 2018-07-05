/*
 * Copyright 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.plaidapp.core.designernews.data.api.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import io.plaidapp.core.data.PlaidItem
import kotlinx.android.parcel.Parcelize
import java.util.Date

/**
 * Models a Designer News story
 */
@Parcelize
class Story(
    override val id: Long = 0,
    override val title: String? = null,
    override var url: String? = null,
    @SerializedName("comment") val comment: String? = null,
    @SerializedName("comment_html") val commentHtml: String? = null,
    @SerializedName("comment_count") val commentCount: Int = 0,
    @SerializedName("vote_count") val voteCount: Int = 0,
    @SerializedName("user_id") val userId: Long = 0,
    @SerializedName("created_at") val createdAt: Date? = null,
    @SerializedName("links") val links: StoryLinks? = null,
    @SerializedName("user_display_name") val userDisplayName: String? = null, // Removed in DN API V2
    @SerializedName("user_portrait_url") val userPortraitUrl: String? = null, // Removed in DN API V2
    @SerializedName("user_job") val userJob: String? = null,
    @SerializedName("comments") val comments: List<Comment> = emptyList() // Removed in DN API V2
) : PlaidItem(id, title, url), Parcelable