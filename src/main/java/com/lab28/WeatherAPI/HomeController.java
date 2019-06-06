package com.lab28.WeatherAPI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lab28.WeatherAPI.entity.Weather;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		RestTemplate rt = new RestTemplate();

		HttpEntity<Weather> entity = null;
		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		ResponseEntity<Weather> response = rt.exchange(url, HttpMethod.GET, entity, Weather.class);

		//		Forecast f = null;
		
//		for(int i = 0; i < w.getTime().getStartPeriodName().size(); i++) {
//			
//			String time = w.getTime().getStartPeriodName().get(i);
//			String weather = w.getData().getWeather().get(i);
//			Integer temperature = w.getData().getTemperature().get(i);
//			f = new Forecast(time, weather, temperature);
//		}
//		weather.save(f);
		System.out.println(response.getBody().getData().getTemperature());
		System.out.println(response.getBody().getData().getWeather());
				
		return new ModelAndView("index", "forecast", response.getBody().getData().getText());
	}
	
	@RequestMapping("/location-form")
	public ModelAndView findLocation(@RequestParam("lat") Double lat, @RequestParam("lon") Double lon) {
		
		RestTemplate rt = new RestTemplate();

		HttpEntity<Weather> entity = null;
		String url = "https://forecast.weather.gov/MapClick.php?lat=" + lat + "&lon=" + lon + "&FcstType=json";
		ResponseEntity<Weather> response = rt.exchange(url, HttpMethod.GET, entity, Weather.class);
		return new ModelAndView("redirect:/", "forecastLocation", response.getBody().getData().getText());
	}

}
