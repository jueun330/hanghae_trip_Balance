package com.move.TripBalance.controller;

import com.move.TripBalance.service.ApiService;
import com.move.TripBalance.service.MapService;
import lombok.RequiredArgsConstructor;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final ApiService apiService;

    private final MapService mapService;

    @GetMapping("/tb/apitest")
    public String getApi(@RequestParam Double lon, @RequestParam Double lat) throws IOException, ParseException {
        return apiService.getLawCode(lon,lat);
    }

    @GetMapping("/tb/kakao")
    public String getMap(@RequestParam Double lon, @RequestParam Double lat) throws ParseException {
        return mapService.mapCode(lon, lat);
    }
}
