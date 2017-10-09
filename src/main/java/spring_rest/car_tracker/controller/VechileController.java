package spring_rest.car_tracker.controller;

import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Spring_rest_car_tracker.service.VechileService;
import spring_rest.car_tracker.constants.URI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import spring_rest.car_tracker.entity.Vechile;
import spring_rest.car_tracker.entity.VechileDetails;

@RestController
@RequestMapping(value="vechiles")
@Api(tags="Vechiles")
public class VechileController {
	VechileService vechileService;
	
	
	
	public VechileController(VechileService vechileService) {
		super();
		this.vechileService = vechileService;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ApiOperation(value="Find all Users", notes= "Returns a list of Users in the app")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=500,message="Internal Error")
	})
	public List<Vechile> findAll(){
		return vechileService.findAll();
	}
	@RequestMapping(method=RequestMethod.GET, value=URI.ID)
	@ApiOperation(value="Find User by Id", notes= "Returns a User if it exists in the app")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=404,message="Not Found"),
			@ApiResponse(code=500,message="Internal Error")
	})
	public Vechile findOne(@PathVariable(URI.ID) String id){
		return vechileService.findOne(id);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT)
	@ApiOperation(value="Add  Vechile", notes= "Updates an existing User")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=400,message="Bad Request"),
			@ApiResponse(code=500,message="Internal Error")
	})
	public List<Vechile> add(@RequestBody List<Vechile> vechiles){
		return vechileService.add(vechiles);
	}
	@RequestMapping(method=RequestMethod.POST)
	@ApiOperation(value="Add  Vechile", notes= "Updates an existing User")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Success"),
			@ApiResponse(code=400,message="Bad Request"),
			@ApiResponse(code=500,message="Internal Error")
	})
	public VechileDetails addvechiledetails(VechileDetails vechiledetails){
		return vechileService.addvechiledetails(vechiledetails);
	}
	
	

}
