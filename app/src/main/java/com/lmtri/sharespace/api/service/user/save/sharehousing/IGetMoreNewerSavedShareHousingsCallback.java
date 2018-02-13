package com.lmtri.sharespace.api.service.user.save.sharehousing;

import com.lmtri.sharespace.api.model.SavedShareHousing;

import java.util.List;

/**
 * Created by lmtri on 12/2/2017.
 */

public interface IGetMoreNewerSavedShareHousingsCallback {
    void onGetComplete(List<SavedShareHousing> newerSavedShareHousings);
    void onGetFailure(Throwable t);
}
