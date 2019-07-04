package org.demo.naka.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
	private int id;
	private String message;
}
