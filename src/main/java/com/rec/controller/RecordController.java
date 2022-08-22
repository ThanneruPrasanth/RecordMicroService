package com.rec.controller;

import java.util.List;
import com.rec.entity.Record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rec.service.IRecordService;

@RestController
@RequestMapping("/record")
public class RecordController {
	
	@Autowired
	public IRecordService iRecordService;
	
	@GetMapping("/emp/{eId}")
	public List<Record> getRecord(@PathVariable("eId") Long eId){
		
		return this.iRecordService.getRecordOfEmployee(eId);
	}

}
