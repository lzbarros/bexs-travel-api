package com.bexs.travel.application.usecases;

import com.bexs.travel.domain.vo.TravelRoute;
import com.bexs.travel.domain.entities.Route;

import javax.inject.Inject;
import javax.inject.Named;

@Named("routeFacade")
public class RouteFacade implements IRouteFacade {

    @Inject
    private IRouteCase routeCase;

    @Override
    public Route save(String routeFrom, String routeTo, Long value) {
        return routeCase.save(routeFrom, routeTo, value);
    }

    @Override
    public TravelRoute findBestRoute(String routeFrom, String routeTo) {
        return routeCase.findBestRoute(routeFrom, routeTo);
    }
}
