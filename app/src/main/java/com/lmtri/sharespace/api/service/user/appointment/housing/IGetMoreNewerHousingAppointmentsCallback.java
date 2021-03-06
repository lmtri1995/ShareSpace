package com.lmtri.sharespace.api.service.user.appointment.housing;

import com.lmtri.sharespace.api.model.HousingAppointment;

import java.util.List;

/**
 * Created by lmtri on 12/2/2017.
 */

public interface IGetMoreNewerHousingAppointmentsCallback {
    void onGetComplete(List<HousingAppointment> housingAppointments);
    void onGetFailure(Throwable t);
}
