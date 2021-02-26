package com.chooloo.www.koler.ui.recents

import com.chooloo.www.koler.entity.Recent
import com.chooloo.www.koler.ui.list.ListMvpView

interface RecentsMvpView : ListMvpView {
    fun observe(): Any?
    fun openRecent(recent: Recent)
}