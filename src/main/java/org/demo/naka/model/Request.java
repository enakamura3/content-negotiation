package org.demo.naka.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Request {

	private int id;
	private String name;
}
