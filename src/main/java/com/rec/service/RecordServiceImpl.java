package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	

	List<Record> list=List.of(
			
			new Record(1L,"tata@gmail.com","TATA",1411L),
			new Record(2L,"jbl@gmail.com","jbl",1412L),
			new Record(3L,"tcs@gmail.com","tcs",1413L),
			new Record(4L,"bosh@gmail.com","bosh",1414L),
			new Record(5L,"infosys@gmail.com","infosys",1415L),
			new Record(6L,"j2w@gmail.com","j2w",1416L),
			new Record(7L,"SRIT@gmail.com","SRIT",1417L),
			new Record(8L,"datamatic@gmail.com","datamatic",1418L),
			new Record(9L,"wipro@gmail.com","wipro",1419L)
			);

	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		
		
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

	
}
